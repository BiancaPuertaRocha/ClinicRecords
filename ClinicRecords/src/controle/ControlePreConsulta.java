/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import Utilidades.Controle;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;
import modelo.Consulta;
import modelo.FichaAtendimento;
import modelo.Funcionario;
import modelo.Medico;
import modelo.Pessoa;
import modelo.PreConsulta;

/**
 *
 * @author Bianca
 */
public class ControlePreConsulta extends Controle {

    public List<PreConsulta> pesquisaPrecMed(Medico pesquisa) {
        List<PreConsulta> prec;
        TypedQuery<PreConsulta> consulta;
        EntityManager em = getEntityManger();
        consulta = em.createNamedQuery("PesquisaPrecMed", PreConsulta.class);
        consulta.setParameter("busca", pesquisa);
        prec = consulta.getResultList();
        em.close();
        return prec;
    }

    public PreConsulta pesquisaPrecAtendi(FichaAtendimento pesquisa) {
        PreConsulta prec;
        TypedQuery<PreConsulta> consulta;
        EntityManager em = getEntityManger();
        consulta = em.createNamedQuery("PesquisaPrecAtend", PreConsulta.class);
        consulta.setParameter("busca", pesquisa);

        prec = consulta.getSingleResult();
        em.close();
        return prec;
    }

    public List<PreConsulta> pesquisaPrecNomeMed(String pesquisa) {
        List<PreConsulta> prec;
        TypedQuery<PreConsulta> consulta;
        EntityManager em = getEntityManger();
        consulta = em.createNamedQuery("PesquisaPrecNomeMed", PreConsulta.class);
        consulta.setParameter("busca", pesquisa);
        prec = consulta.getResultList();
        em.close();
        return prec;
    }

    public List<PreConsulta> pesquisaPrecPaciente(Pessoa pesquisa) {
        List<PreConsulta> prec;
        TypedQuery<PreConsulta> consulta;
        EntityManager em = getEntityManger();
        consulta = em.createNamedQuery("PesquisaPrecPaciente", PreConsulta.class);
        consulta.setParameter("busca", pesquisa);
        prec = consulta.getResultList();
        em.close();
        return prec;
    }

    public List<Consulta> listaConsultasDataMed(Date data, Medico medico) {
        List<Consulta> m;
        EntityManager em = getEntityManger();
        Query s = em.createNativeQuery("select * from preConsulta  where DATE(dataPrec)  = ? and medico = ?  ", PreConsulta.class);
        s.setParameter(2, medico.getCodigo());
        s.setParameter(1, data, TemporalType.DATE);
        m = s.getResultList();
        em.close();

        return m;
    }

    public List<PreConsulta> pesquisaPrecPacienteNome(String pesquisa) {
        List<PreConsulta> prec;
        TypedQuery<PreConsulta> consulta;
        EntityManager em = getEntityManger();
        consulta = em.createNamedQuery("PesquisaPrecPacienteNome", PreConsulta.class);
        consulta.setParameter("busca", pesquisa);
        prec = consulta.getResultList();
        em.close();
        return prec;
    }

    public List<PreConsulta> listaPre() {
        List<PreConsulta> pre;
        Query consulta;
        String consultaSQL;
        EntityManager em = getEntityManger();
        consultaSQL = "select pre from PreConsulta pre";
        consulta = em.createQuery(consultaSQL);
        pre = consulta.getResultList();
        em.close();
        return pre;
    }

    public Date getDateWithoutTime(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    public List<PreConsulta> pesquisaPrecData(Date pesquisa) {
        List<PreConsulta> m;
        EntityManager em = getEntityManger();
        Query q = em.createNativeQuery("select * from preConsulta  where DATE(dataPrec) = ?", PreConsulta.class);
        q.setParameter(1, pesquisa, TemporalType.DATE);
        m = q.getResultList();
        em.close();
        return m;
    }

    public List<PreConsulta> pesquisaPrecMedDataBool(Date data, Medico medico) {
        List<PreConsulta> m;
        EntityManager em = getEntityManger();
        Query q = em.createNativeQuery("select * from preConsulta  where DATE(dataPrec) = ? and medico = ? and situacao=true", PreConsulta.class);
        q.setParameter(1, getDateWithoutTime(data), TemporalType.DATE);
        q.setParameter(2, medico.getCodigo());

        m = q.getResultList();
        em.close();
        return m;
    }

    public List<PreConsulta> listaPreFuncionario(Funcionario funci) {
        List<PreConsulta> m;
        EntityManager em = getEntityManger();
        Query q = em.createNativeQuery("select * from preConsulta  where funcionario = ? ", PreConsulta.class);

        q.setParameter(1, funci.getCodigo());

        m = q.getResultList();
        em.close();
        return m;
    }
 public List<PreConsulta> listaPreFuncionarioPessoa(int funci) {
        List<PreConsulta> m;
        EntityManager em = getEntityManger();
        Query q = em.createNativeQuery("select * from preConsulta  where funcionario = ? ", PreConsulta.class);

        q.setParameter(1, funci);

        m = q.getResultList();
        em.close();
        return m;
    }
}
