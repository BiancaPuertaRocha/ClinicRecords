
package controle;

import modelo.Medico;
import Utilidades.Controle;
import java.util.List;
import javax.persistence.EntityManager;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class ControleMedico extends Controle {
    public ControleMedico() {

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
        List<Medico> medico;
        TypedQuery<Medico> consulta;
        String parSQL;
        EntityManager em = getEntityManger();
        parSQL = "%"+pesquisa+"%";
        consulta = em.createNamedQuery("MedicoConsultaNome",Medico.class);
        consulta.setParameter("titbusca", parSQL);
        medico = consulta.getResultList();
        em.close();
        return medico;
    }
    public List<Medico> buscarNome(String nome){
            EntityManager em = getEntityManger();
            TypedQuery<Medico> consulta;
           
            consulta=em.createNamedQuery("MedicoConsultaNome",Medico.class);
           
            consulta.setParameter("titbusca", "%"+nome+"%");
            
            return consulta.getResultList();
        }

}
