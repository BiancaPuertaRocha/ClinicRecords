
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name="fichaAtend")
public class FichaAtendimento implements Serializable{
    @Id
    private int codigo;
    private Funcionario funcionario;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataatend;
    private TipoAtendi tipoatend;
    private Pessoa paciente;
    private int numeroordem;
    private boolean atendmed;

    @Override
    public String toString() {
        return "FichaAtendimento{" + "paciente=" + paciente + '}';
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

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
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
    
}
