
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="fichaAtend")
@NamedQueries (
        {
            @NamedQuery(name="Ficha.FichaPorTipo",query="SELECT count(f) FROM FichaAtendimento f WHERE f.tipoatend = :busca"),
            @NamedQuery(name="Ficha.FichaPorDia",query="SELECT count(f) FROM FichaAtendimento f WHERE f.dataatend = :databusca"),
             @NamedQuery(name="Ficha.FichaPaciente",query="SELECT f FROM FichaAtendimento f WHERE f.paciente = :busca"),
            @NamedQuery(name="Ficha.FichaNumber",query="SELECT f.codigo FROM FichaAtendimento f where f.situacao=false and f.atendmed=true and  f.paciente = :busca and f.numeroordem= :numordem and f.dataatend= :data"),
            @NamedQuery(name="Ficha.FichaNomePac",query="SELECT f FROM FichaAtendimento f where f.situacao=false and f.atendmed=true and  f.paciente.nome like :busca and f.dataatend = :busca2"),
        @NamedQuery(name="PesquisaFicha",query="SELECT f FROM FichaAtendimento f WHERE f.codigo = :busca"),})

public class FichaAtendimento implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    @JoinColumn (name = "funcionario", referencedColumnName="codigo")
    @ManyToOne
    private Pessoa funcionario;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataatend;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataregistro;
    @JoinColumn (name = "tipoatend", referencedColumnName="codigo")
    @ManyToOne
    private TipoAtendi tipoatend;
    @JoinColumn (name = "paciente", referencedColumnName="codigo")
    @ManyToOne
    private Pessoa paciente;
    private int numeroordem;
    private boolean atendmed;
    private boolean situacao;
    @OneToOne(mappedBy = "fichaatend")
    PreConsulta preConsulta;
    
    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "FichaAtendimento{" + "paciente=" + paciente + '}';
    }

    public Date getDataregistro() {
        return dataregistro;
    }

    public void setDataregistro(Date dataregistro) {
        this.dataregistro = dataregistro;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + this.codigo;
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
        final FichaAtendimento other = (FichaAtendimento) obj;
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

    public Pessoa getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Pessoa funcionario) {
        this.funcionario = funcionario;
    }

    public Date getDataatend() {
        return dataatend;
    }

    public void setDataatend(Date dataatend) {
        this.dataatend = dataatend;
    }

    public TipoAtendi getTipoatend() {
        return tipoatend;
    }

    public void setTipoatend(TipoAtendi tipoatend) {
        this.tipoatend = tipoatend;
    }

    public Pessoa getPaciente() {
        return paciente;
    }

    public void setPaciente(Pessoa paciente) {
        this.paciente = paciente;
    }

    public int getNumeroordem() {
        return numeroordem;
    }

    public void setNumeroordem(int numeroordem) {
        this.numeroordem = numeroordem;
    }

    public boolean isAtendmed() {
        return atendmed;
    }

    public void setAtendmed(boolean atendmed) {
        this.atendmed = atendmed;
    }

    public PreConsulta getPreConsulta() {
        return preConsulta;
    }

    public void setPreConsulta(PreConsulta preConsulta) {
        this.preConsulta = preConsulta;
    }
    
    
    
}
