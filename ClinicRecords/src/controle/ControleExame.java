
package controle;

import Utilidades.Controle;
import java.util.List;
import javax.persistence.EntityManager;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import modelo.Exame;
import modelo.ItemDeExame;

public class ControleExame extends Controle {

    

    public ControleExame() {

    }

   
    public List<Exame> listaExame() {
        List<Exame> exame;
        Query consulta;
        String consultaSQL;
        EntityManager em = getEntityManger();
        consultaSQL = "select e from Exame e";
        consulta = em.createQuery(consultaSQL);
        exame = consulta.getResultList();
        em.close();
        return exame;
    }

    public List<Exame> pesquisaExame(String pesquisa) {
        List<Exame> exame;
        TypedQuery<Exame> consulta;
        String parSQL;
        EntityManager em = getEntityManger();
        parSQL = "%"+pesquisa+"%";
        consulta = em.createNamedQuery("ExameConsultaDesc",Exame.class);
        consulta.setParameter("titbusca", parSQL);
        exame = consulta.getResultList();
        em.close();
        return exame;
    }
      public List<ItemDeExame> pesquisaExame(Exame pesquisa) {
        List<ItemDeExame> exame;
        TypedQuery<ItemDeExame> consulta;
        Exame parSQL;
        EntityManager em = getEntityManger();
        parSQL = pesquisa;
        consulta = em.createNamedQuery("ExameConsultaDesc",ItemDeExame.class);
        consulta.setParameter("busca", parSQL);
        exame = consulta.getResultList();
        em.close();
        return exame;
    }

}