package controle;

import modelo.Funcionario;
import Utilidades.Controle;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import modelo.Setor;

public class ControleFuncionario extends Controle {

    //variável de classe, variavel para todos os objetos da classe, variavel global
    private static Funcionario logado = null;

    public static Funcionario getLogado() {
        return logado;
    }

    public static void setLogado(Funcionario logado) {
        ControleFuncionario.logado = logado;
    }

    public ControleFuncionario() {

    }

    public List<Funcionario> listaFuncionario() {
        List<Funcionario> funcionario = null;
        Query consulta;
        String consultaSQL;
        EntityManager em = getEntityManger();
        consultaSQL = "select f from Funcionario f";
        consulta = em.createQuery(consultaSQL);
        funcionario = consulta.getResultList();
        em.close();

        return funcionario;
    }

    public List<Funcionario> pesquisaFuncionario(String pesquisa) {
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

    public boolean pesquisaUsuario(String pesquisa) {
        EntityManager em = getEntityManger();
        TypedQuery<Funcionario> consulta;

        consulta = em.createNamedQuery("FuncionarioConsultaNomeUser", Funcionario.class);

        consulta.setParameter("titbusca", pesquisa);
        int res = consulta.getResultList().size();
        em.close();
        if (res > 0) {
            return true;
        } else {
            return false;
        }

    }

    public Funcionario pesquisaUsuarioSenha(String usuario, String senha) {
        EntityManager em = getEntityManger();
        TypedQuery<Funcionario> consulta;

        consulta = em.createNamedQuery("FuncionarioConsultaNomeSenha", Funcionario.class);

        consulta.setParameter("userbusca", usuario);
        consulta.setParameter("senhabusca", senha);
        Funcionario func = null;
        if (consulta.getResultList().size() > 0) {
            func = consulta.getSingleResult();
        }
        em.close();
        return func;
    }

    public List<Funcionario> listaFuncionarioSetor(String pesquisa, Setor setor) {
        List<Funcionario> funcionario;
        TypedQuery<Funcionario> consulta;
        String parSQL;
        EntityManager em = getEntityManger();
        parSQL = "%" + pesquisa + "%";
        consulta = em.createNamedQuery("FuncionarioConsultaSetor", Funcionario.class);
        consulta.setParameter("nome", parSQL);
        consulta.setParameter("setor", setor);
        funcionario = consulta.getResultList();
        em.close();
        return funcionario;
    }

}
