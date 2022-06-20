package controle;

import Utilidades.Controle;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import modelo.FichaAtendimento;
import modelo.Funcionario;
import modelo.Pessoa;
import modelo.TipoAtendi;

public class ControleFichaAtendimento extends Controle {

    public List<FichaAtendimento> listaFichaAtendimento() {
        List<FichaAtendimento> atend;
        Query consulta;
        String consultaSQL;
        EntityManager em = getEntityManger();
        consultaSQL = "select f from FichaAtendimento f";
        consulta = em.createQuery(consultaSQL);
        atend = consulta.getResultList();
        em.close();
        return atend;
    }

    public String getNumOrdem(Date data) {

        EntityManager em = getEntityManger();
        Query consulta;

        consulta = em.createNamedQuery("Ficha.FichaPorDia", FichaAtendimento.class);

        consulta.setParameter("databusca", data);
        String res = consulta.getSingleResult().toString();
        em.close();
        return res;

    }

    public List<FichaAtendimento> pesquisaFichaAtendimentoNome(String busca) {

        List<FichaAtendimento> res;
        EntityManager em = getEntityManger();
        Query consulta;

        consulta = em.createNamedQuery("Ficha.FichaNomePac", FichaAtendimento.class);

        consulta.setParameter("busca", "%" + busca + "%");
        consulta.setParameter("busca2", new Date());
        res = consulta.getResultList();
        em.close();
        return res;

    }

    public List<FichaAtendimento> pesquisaFichaAtendimentoPaciente(Pessoa busca) {

        List<FichaAtendimento> res;
        EntityManager em = getEntityManger();
        Query consulta;

        consulta = em.createNamedQuery("Ficha.FichaPaciente", FichaAtendimento.class);

        consulta.setParameter("busca", busca);
        res = consulta.getResultList();
        em.close();
        return res;

    }

    public List<FichaAtendimento> pesquisaFichaAtendimentoTipoAtend(TipoAtendi busca) {

        List<FichaAtendimento> res;
        EntityManager em = getEntityManger();
        Query consulta;
        consulta = em.createNamedQuery("Ficha.FichaPorTipo", FichaAtendimento.class);
        consulta.setParameter("busca", busca);
        res = consulta.getResultList();
        em.close();
        return res;

    }

    public List<FichaAtendimento> listaAtendFuncionario(Funcionario funci) {
        List<FichaAtendimento> m;
        EntityManager em = getEntityManger();
        Query q = em.createNativeQuery("select * from fichaAtend  where funcionario = ? ", FichaAtendimento.class);

        q.setParameter(1, funci.getCodigo());

        m = q.getResultList();
        em.close();
        return m;
    }

    public List<FichaAtendimento> listaAtendFuncionarioPessoa(int funci) {
        List<FichaAtendimento> m;
        EntityManager em = getEntityManger();
        Query q = em.createNativeQuery("select * from fichaAtend  where funcionario = ? ", FichaAtendimento.class);

        q.setParameter(1, funci);

        m = q.getResultList();
        em.close();
        return m;
    }

}
