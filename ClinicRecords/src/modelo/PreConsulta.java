/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name="preconsulta")
public class PreConsulta implements Serializable{
    @Id
    private int codigo;
    private double peso;
    private double altura;
    private int sistolica;
    private int diastolica;
    private Funcionario funcionario;
    private Medico medico;
    private FichaAtendimento fichaatend;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataPrec;
    private int idade;

    @Override
    public String toString() {
        return "PreConsulta{" + "fichaatend=" + fichaatend + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PreConsulta other = (PreConsulta) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getSistolica() {
        return sistolica;
    }

    public void setSistolica(int sistolica) {
        this.sistolica = sistolica;
    }

    public int getDiastolica() {
        return diastolica;
    }

    public void setDiastolica(int diastolica) {
        this.diastolica = diastolica;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public FichaAtendimento getFichaatend() {
        return fichaatend;
    }

    public void setFichaatend(FichaAtendimento fichaatend) {
        this.fichaatend = fichaatend;
    }

    public Date getDataPrec() {
        return dataPrec;
    }

    public void setDataPrec(Date dataPrec) {
        this.dataPrec = dataPrec;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
