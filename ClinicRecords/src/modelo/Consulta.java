/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "consulta")
@NamedQueries({
    @NamedQuery(name = "Consulta.findAll", query = "SELECT c FROM Consulta c")
    ,
@NamedQuery(name = "Consulta.ConsultaPaciente", query = "SELECT c FROM Consulta c where c.preconsulta.fichaatend.paciente = :busca"),
@NamedQuery(name = "Consulta.ConsultaPre", query = "SELECT c FROM Consulta c where c.preconsulta = :busca"),
@NamedQuery(name = "Consulta.ConsultaPacienteNome", query = "SELECT c FROM Consulta c where c.preconsulta.fichaatend.paciente.nome like :busca"),
@NamedQuery(name = "Consulta.ConsultaMedico", query = "SELECT c FROM Consulta c where c.preconsulta.medico = :busca  and c.dataConsul = :data"),
@NamedQuery(name = "Consulta.ConsultaMedicoSemData", query = "SELECT c FROM Consulta c where c.preconsulta.medico = :busca  "),
@NamedQuery(name = "Consulta.ConsultaMedicoPeriodo", query = "SELECT c FROM Consulta c where c.preconsulta.medico = :busca  and ((c.dataConsul between :data1 and :data2) or c.dataConsul=:data1 or c.dataConsul=:data2 ) and c.situacao = true")})
public class Consulta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "diagnostico")
    private String diagnostico;
    @Column(name = "observacoes")
    private String observacoes;
    @Column(name = "dataConsul")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataConsul;
    @JoinColumn(name = "preconsulta", referencedColumnName = "codigo")
    @OneToOne
    private PreConsulta preconsulta;
    @Column(name = "situacao")
    private boolean situacao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "consulta")
    private Collection<ItemDeReceita> itensReceita;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "consulta")
    private Collection<ItemDeExame> itensExame;

    public boolean isSituacao() {
        return situacao;
    }

    public Collection<ItemDeReceita> getItensOrc() {
        return itensReceita;
    }

    public void setItensOrc(Collection<ItemDeReceita> itensOrc) {
        this.itensReceita = itensOrc;
    }

    public Collection<ItemDeExame> getItensExame() {
        return itensExame;
    }

    public void setItensExame(Collection<ItemDeExame> itensExame) {
        this.itensExame = itensExame;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public Consulta() {
    }

    public Consulta(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Date getDataConsul() {
        return dataConsul;
    }

    public void setDataConsul(Date dataConsul) {
        this.dataConsul = dataConsul;
    }

    public PreConsulta getPreconsulta() {
        return preconsulta;
    }

    public void setPreconsulta(PreConsulta preconsulta) {
        this.preconsulta = preconsulta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consulta)) {
            return false;
        }
        Consulta other = (Consulta) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "-----CONSULTA-------\n"
                + "DIAGNÓSTICO:\n" + this.diagnostico + "\n"
                + "OBSERVAÇÕES:\n" + this.observacoes + "\n"
                + "------------------------------------"
                + this.preconsulta.toString();
    }

}
