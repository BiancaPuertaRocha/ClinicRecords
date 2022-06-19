/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;


import modelo.Pessoa;
import Utilidades.Controle;
import java.util.List;
import javax.persistence.EntityManager;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author Aluno
 */
public class ControlePaciente extends Controle{
    
    public ControlePaciente() {

    }
    public List<Pessoa> listaPaciente() {
        List<Pessoa> paciente;
        Query consulta;
        String consultaSQL;
        EntityManager em = getEntityManger();
        consultaSQL = "select paciente from Pessoa paciente";
        consulta = em.createQuery(consultaSQL);
        paciente = consulta.getResultList();
        em.close();
        return paciente;
    }
   
    public List<Pessoa> pesquisaPaciente(String pesquisa) {
        List<Pessoa> paciente;
        TypedQuery<Pessoa> consulta;
        String parSQL;
        EntityManager em = getEntityManger();
        parSQL = "%"+pesquisa+"%";
        consulta = em.createNamedQuery("PessoaConsultaNome",Pessoa.class);
        consulta.setParameter("titbusca", parSQL);
        paciente = consulta.getResultList();
        em.close();
        return paciente;
    }
     public List<Pessoa> buscarNome(String nome){
            EntityManager em = getEntityManger();
            TypedQuery<Pessoa> consulta;
           
            consulta=em.createNamedQuery("Pessoa.findByNome",Pessoa.class);
           
            consulta.setParameter("nome", "%"+nome+"%");
            
            return consulta.getResultList();
        }
}
