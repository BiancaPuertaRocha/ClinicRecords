/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.Pessoa;


import java.io.Serializable;
import javax.persistence.DiscriminatorValue;

import javax.persistence.Entity;

import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name="medico")
@NamedQueries (
        {
            @NamedQuery(name="MedicoConsultaNome",query="SELECT m FROM Medico m WHERE m.nome LIKE :titbusca"),})
@DiscriminatorValue("MEDICO") 
public class Medico extends Pessoa implements Serializable{

   
    private String nomeuser;
    private String senha;
    private String crm;
    private String especialidade;
    private int maxatendi;


    public int getMaxatendi() {
        return maxatendi;
    }

    public void setMaxatendi(int maxatendi) {
        this.maxatendi = maxatendi;
    }

   
    public String getNomeuser() {
        return nomeuser;
    }

    public void setNomeuser(String nomeuser) {
       
        this.nomeuser = nomeuser;
      
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
    
        this.senha = senha;
       
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
      
        this.crm = crm;
  
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
      
        this.especialidade = especialidade;
   
    }
    
    
    
}
