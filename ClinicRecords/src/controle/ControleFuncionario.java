package controle;

import modelo.Funcionario;
import Utilidades.Controle;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class ControleFuncionario extends Controle {

    public ControleFuncionario() {

    }

    

    public List<Funcionario> listaFuncionario() {
        List<Funcionario> funcionario = null;
        Query consulta;
        String consultaSQL;
        EntityManager em = getEntityManger();
        consultaSQL = "select func from Funcionario func";
        consulta = em.createQuery(consultaSQL);
        funcionario = consulta.getResultList();
        em.close();

        return funcionario;
    }

    public List<Funcionario> pesquisaMedico(String pesquisa) {
        List<Funcionario> funcionario;
        TypedQuery<Funcionario> consulta;
        String parSQL;
        EntityManager em = getEntityManger();
        parSQL = "%" + pesquisa + "%";
        consulta = em.createNamedQuery("FuncionarioConsultaNome", Funcionario.class);
        consulta.setParameter("titbusca", parSQL);
        funcionario = consulta.getResultList();
        em.close();
        return funcionario;
    }

    public List<Funcionario> pesquisaFuncionario(String pesquisa) {
        List<Funcionario> funcionario = null;

        return funcionario;
    }
}
