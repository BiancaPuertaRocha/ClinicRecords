package controle;

import modelo.Medico;
import Utilidades.Controle;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import modelo.PreConsulta;

public class ControleMedico extends Controle {

    ControlePreConsulta controlePrec;
    //variável de classe, variavel para todos os objetos da classe, variavel global
    private static Medico logado = null;

    public static Medico getLogado() {
        return logado;
    }

    public static void setLogado(Medico logado) {
        ControleMedico.logado = logado;
    }

    public ControleMedico() {
        controlePrec = new ControlePreConsulta();
    }

    public List<Medico> medicosDisponiveisTudo() {
        return medicosDisponiveis(listaMedico());
    }

    public List<Medico> medicosDisponiveisNome(List<Medico> listainicio) {
        return medicosDisponiveis(listainicio);
    }

    private List<Medico> medicosDisponiveis(List<Medico> listainicio) {
        List<Medico> outra;
        Date datarecebida = new Date();
        outra = listainicio;
        if (listainicio.size() > 0) {

            for (int x = 0; x <= listainicio.size() - 1; x++) {
                int quantidade = 0;
                Medico medico = listainicio.get(x);
                for (PreConsulta pre : controlePrec.pesquisaPrecMed(medico)) {
                    if (pre.getDataPrec().compareTo(datarecebida) == 1) {
                        quantidade++;
                    }
                }
                if (quantidade >= medico.getMaxatendi()) {
                    outra.remove(medico);
                }
            }
            System.out.println(outra);
        }
        return outra;
    }

    public List<Medico> listaMedico() {
        List<Medico> medico;
        Query consulta;
        String consultaSQL;
        EntityManager em = getEntityManger();
        consultaSQL = "select medico from Medico medico";
        consulta = em.createQuery(consultaSQL);
        medico = consulta.getResultList();
        em.close();
        return medico;
    }

    public List<Medico> pesquisaMedico(String pesquisa) {
        EntityManager em = getEntityManger();
        TypedQuery<Medico> consulta;

        consulta = em.createNamedQuery("MedicoConsultaNome", Medico.class);

        consulta.setParameter("titbusca", "%" + pesquisa + "%");
        List<Medico> res = consulta.getResultList();
        em.close();
        return res;
    }

    public boolean pesquisaNomeUsuario(String pesquisa) {
        EntityManager em = getEntityManger();
        TypedQuery<Medico> consulta;

        consulta = em.createNamedQuery("MedicoConsultaNomeUser", Medico.class);

        consulta.setParameter("titbusca", pesquisa);
        int res = consulta.getResultList().size();
        em.close();
        if (res > 0) {
            return true;

        } else {
            return false;
        }
    }

    public Medico pesquisaUsuarioSenha(String usuario, String senha) {
        EntityManager em = getEntityManger();
        TypedQuery<Medico> consulta;

        consulta = em.createNamedQuery("MedicoConsultaNomeSenha", Medico.class);

        consulta.setParameter("userbusca", usuario);
        consulta.setParameter("senhabusca", senha);
        Medico med = null;
        if (consulta.getResultList().size() > 0) {
            med = consulta.getSingleResult();
        }
        em.close();
        return med;
    }
   

}
