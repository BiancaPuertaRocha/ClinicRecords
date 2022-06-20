/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import Utilidades.Controle;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import modelo.ItemDeReceita;
import modelo.Medicamento;

public class ControleMedicamento  extends Controle {
        public List<Medicamento> listaMed() {
        List<Medicamento> m;
        Query consulta;
        String consultaSQL;
        EntityManager em = getEntityManger();
        consultaSQL = "select m from Medicamento m";
        consulta = em.createQuery(consultaSQL);
        m = consulta.getResultList();
        em.close();
        return m;
    }

    public List<Medicamento> pesquisaMed(String pesquisa) {
        EntityManager em = getEntityManger();
            TypedQuery<Medicamento> consulta;
           
            consulta=em.createNamedQuery("MedicamentoConsultaDesc",Medicamento.class);
           
            consulta.setParameter("titbusca", "%"+pesquisa+"%");
            List<Medicamento> res = consulta.getResultList();
            em.close();
            return res;
    }
    public List<ItemDeReceita> pesquisaMedicamentoItem(Medicamento pesquisa) {
        EntityManager em = getEntityManger();
            TypedQuery<ItemDeReceita> consulta;
           
            consulta=em.createNamedQuery("itemReceitaMed",ItemDeReceita.class);
           
            consulta.setParameter("busca", pesquisa);
            List<ItemDeReceita> res = consulta.getResultList();
            em.close();
            return res;
    }
}
