
package controle;

import modelo.TipoAtendi;
import Utilidades.Controle;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class ControleTipoAtendi extends Controle {

    public ControleTipoAtendi() {

    }

   
    
    public List<TipoAtendi> listaTipo() {
        List<TipoAtendi> tipo;
        Query consulta;
        String consultaSQL;
        EntityManager em = getEntityManger();
        consultaSQL = "select tipo from TipoAtendi tipo";
        consulta = em.createQuery(consultaSQL);
        tipo = consulta.getResultList();
        em.close();
        return tipo;
    }

    public List<TipoAtendi> pesquisaTipo(String pesquisa) {
        List<TipoAtendi> tipo;
        TypedQuery<TipoAtendi> consulta;
        String parSQL;
        EntityManager em = getEntityManger();
        parSQL = "%"+pesquisa+"%";
        consulta = em.createNamedQuery("TipoConsultaDecricao",TipoAtendi.class);
        consulta.setParameter("busca", parSQL);
        tipo = consulta.getResultList();
        em.close();
        return tipo;
    }

}