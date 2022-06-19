/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="funcionario")
@NamedQueries (
        {
            @NamedQuery(name="FuncionarioConsultaNome",query="SELECT f FROM Funcionario f WHERE f.nome LIKE :titbusca"),
                 
        })
@DiscriminatorValue("FUNCIONARIO")
public class Funcionario extends Pessoa  implements Serializable {
    private String nomeuser;
    private String senha;
    @JoinColumn (name = "setor", referencedColumnName="codigo")
    @ManyToOne
    private Setor setor;
    private boolean tipo;

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + super.getNome() + '}';
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



    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    
    
}
