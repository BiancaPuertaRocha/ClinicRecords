
package controle;

import modelo.Setor;
import Utilidades.Controle;
import java.util.List;
import javax.persistence.EntityManager;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class ControleSetor extends Controle {

    

    public ControleSetor() {

    }

   
    public List<Setor> listaSetor() {
        List<Setor> setor;
        Query consulta;
        String consultaSQL;
        EntityManager em = getEntityManger();
        consultaSQL = "select setor from Setor setor";
        consulta = em.createQuery(consultaSQL);
        setor = consulta.getResultList();
        em.close();
        return setor;
    }

    public List<Setor> pesquisaSetor(String pesquisa) {
        List<Setor> setor;
        TypedQuery<Setor> consulta;
        String parSQL;
        EntityManager em = getEntityManger();
        parSQL = "%"+pesquisa+"%";
        consulta = em.createNamedQuery("SetorConsultaDesc",Setor.class);
        consulta.setParameter("titbusca", parSQL);
        setor = consulta.getResultList();
        em.close();
        return setor;
    }

}