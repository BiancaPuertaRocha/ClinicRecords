package modelo;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.CascadeType;
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
import javax.persistence.Transient;

@Entity
@Table(name = "preConsulta")
@NamedQueries({
    @NamedQuery(name = "PesquisaPrecMed", query = "SELECT p FROM PreConsulta p WHERE p.medico = :busca")
    ,
     
@NamedQuery(name = "PesquisaPrecAtend", query = "SELECT p FROM PreConsulta p WHERE p.fichaatend = :busca ")
    ,
@NamedQuery(name = "PesquisaPrecNomeMed", query = "SELECT p FROM PreConsulta p WHERE p.medico.nome like :busca")
    ,
@NamedQuery(name = "PesquisaPrecPaciente", query = "SELECT p FROM PreConsulta p WHERE p.fichaatend.paciente = :busca"),

@NamedQuery(name = "PesquisaPrecPacienteNome", query = "SELECT p FROM PreConsulta p WHERE p.fichaatend.paciente.nome = :busca")})
public class PreConsulta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private double peso;
    private double altura;
    private int sistolica;
    private int diastolica;
    @JoinColumn(name = "funcionario", referencedColumnName = "codigo")
    @ManyToOne
    private Funcionario funcionario;
    @JoinColumn(name = "medico", referencedColumnName = "codigo")
    @ManyToOne
    private Medico medico;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fichaatend", referencedColumnName = "codigo")
    private FichaAtendimento fichaatend;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataPrec;
    private String temperatura;
    private boolean situacao;
    private int numeroordem;
     @OneToOne(mappedBy = "preconsulta")
    Consulta consulta;

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
     
     
    public int getNumeroordem() {
        return numeroordem;
    }

    public void setNumeroordem(int numeroordem) {
        this.numeroordem = numeroordem;
    }
    
    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public void setDataPrec(Date dataPrec) {
        this.dataPrec = dataPrec;
    }
  

  
    public PreConsulta() {

    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        String ret;
        if (funcionario != null) {
            ret = "COMPARECEU";
        } else {
            ret = "NÃO COMPARECEU";
        }
        String funcionarioApresentar;
        if (this.getFuncionario() != null) {
            funcionarioApresentar = this.getFuncionario().getNome();
        } else {
            funcionarioApresentar = "Não Associado.";
        }
        return "PreConsulta:"
                + "\n Nome do paciente:"
                + fichaatend.getPaciente().getNome()
                + "\n Cartão SUS:"
                + fichaatend.getPaciente().getCartsus()
                + "\n CPF: "
                + fichaatend.getPaciente().getCpf()
                + "\n Endereço:\n"
                + fichaatend.getPaciente().getUf() + "  " + fichaatend.getPaciente().getCidade() + "  " + fichaatend.getPaciente().getBairro() + "\n" + fichaatend.getPaciente().getEndereco()
                + "\n"
                + "\n-----INFORMAÇÕES IMEDIATAS-----"
                + "\n Sistólica:\n"
                + this.getSistolica()
                + "\n Diastólica:\n"
                + this.getDiastolica()
                + "\n Peso:\n"
                + this.getPeso()
                + "\n Altura:\n"
                + this.getAltura()
                +"\n Temperatura:\n"
                +this.temperatura
                + "\n"
                + "\n-----INFORMAÇÕES SOBRE AGENDAMENTO E REGISTRO-----"
                + "\n Data prevista para o atendimento:\n"
                + fichaatend.getDataatend()
                + "\n Funcionário responsável pela Pré-Consulta:\n"
                + funcionarioApresentar
                + "\n Médico:\n"
                + this.getMedico().getNome()
                + "\n Data de agendamento:\n"
                + fichaatend.getDataregistro()
                + "\n Agendado com:\n "
                + fichaatend.getFuncionario().getNome()
                + "\n Data da realização:\n"
                + this.getDataPrec()
                + "\n Situação:" + ret;
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

   

}
