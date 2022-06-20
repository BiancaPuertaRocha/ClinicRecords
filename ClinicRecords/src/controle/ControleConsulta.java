/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import Utilidades.Controle;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import modelo.Consulta;
import modelo.Medico;
import modelo.Pessoa;
import modelo.PreConsulta;

/**
 *
 * @author Aluno
 */
public class ControleConsulta extends Controle {
     
    public List<Consulta> listaConsulta() {
        List<Consulta> consulta;
        Query consultaRetornar;
        String consultaSQL;
        EntityManager em = getEntityManger();
        consultaSQL = "select c from Consulta c";
        consultaRetornar = em.createQuery(consultaSQL);
        consulta = consultaRetornar.getResultList();
        em.close();
        return consulta;
    }

 public List<Consulta> listaConsultasPendentes(Date data, Medico medico) {
        List<Consulta>  m, lista2;
        lista2 = new ArrayList<Consulta>();
        EntityManager em = getEntityManger();
        Query s = em.createNativeQuery("select c.* from consulta c, preConsulta p where c.preconsulta = p.codigo and p.medico = ? and c.situacao=false",Consulta.class);
        s.setParameter(1, medico.getCodigo());
        m = s.getResultList();
        em.close();
        for(Consulta c: m){
            if(getDateWithoutTime(c.getDataConsul()).equals(getDateWithoutTime(data))){
                lista2.add(c);
            }
        }
        
        return lista2;
    }
    public List<Consulta> listaConsultasTodasData(Date data) {
        List<Consulta>  m, lista2;
        lista2 = new ArrayList<Consulta>();
        EntityManager em = getEntityManger();
        Query s = em.createNativeQuery("select c.* from consulta c, preConsulta p where c.preconsulta = p.codigo ",Consulta.class);
        
       
        m = s.getResultList();
        em.close();
        for(Consulta c: m){
            if(getDateWithoutTime(c.getDataConsul()).equals(getDateWithoutTime(data))){
                lista2.add(c);
            }
        }
        
        return lista2;
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
    public List<Consulta> listaConsultasPciente(Pessoa paciente) {
        EntityManager em = getEntityManger();
        Query consulta;
        consulta = em.createNamedQuery("Consulta.ConsultaPaciente", Consulta.class);
        consulta.setParameter("busca", paciente);
        List<Consulta> res = consulta.getResultList();
        em.close();
        return res;
    }
    public List<PreConsulta> listaConsultasPre(PreConsulta pre) {
        EntityManager em = getEntityManger();
        Query consulta;
        consulta = em.createNamedQuery("Consulta.ConsultaPre", Consulta.class);
        consulta.setParameter("busca", pre);
        List<PreConsulta> res = consulta.getResultList();
        em.close();
        return res;
    }
     public List<Consulta> listaConsultasPcienteNome(String paciente) {
        EntityManager em = getEntityManger();
        Query consulta;
        consulta = em.createNamedQuery("Consulta.ConsultaPacienteNome", Consulta.class);
        consulta.setParameter("%"+"busca"+"%", paciente);
        List<Consulta> res = consulta.getResultList();
        em.close();
        return res;
    }
     public List<Consulta> listaConsultasMedPeriodo(Medico med, Date data1, Date data2){
          
        EntityManager em = getEntityManger();
        Query consulta;
        consulta = em.createNamedQuery("Consulta.ConsultaMedicoPeriodo", Consulta.class);
        consulta.setParameter("busca",med);
        consulta.setParameter("data1",data1);
        consulta.setParameter("data2",data2);
        
        List<Consulta> res = consulta.getResultList();
        em.close();
        return res;
    
     }
        public List<Consulta> listaConsultasMed(Medico med){
          
        EntityManager em = getEntityManger();
        Query consulta;
        consulta = em.createNamedQuery("Consulta.ConsultaMedicoSemData", Consulta.class);
        consulta.setParameter("busca",med);
        
        
        List<Consulta> res = consulta.getResultList();
        em.close();
        return res;
    
     }
    
}
