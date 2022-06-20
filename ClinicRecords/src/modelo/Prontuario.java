package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Prontuario implements Serializable {
    @Id
    private int codigo;
    private String cpf;
    private String TYPE;
    private String rg;
    private String nome;
    private String cidade;
    private String endereco;
    private String email;
    private String telefone;
    private String estcivil;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datanasc;
    private String profissao;
    private String cartsus;
    private String uf;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datacad;
    private String nomemae;
    private String nomepai;
    private String sexo;
    private String bairro;
    private String tiposang;
    //prec
    private double peso;
    private double altura;
    private int sistolica;
    private int diastolica;
    private String medico;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataPrec;
    private String temperatura;
    private boolean situacao;
    private int numeroordem;

    //atend
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataatend;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataregistro;
    //private String tipoatend;
    private int numeroordem2;
    private boolean atendmed;
    private boolean situacao2;

    //consul
    private String diagnostico;
    private String observacoes;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataConsul;

    private boolean situacao3;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "consulta")
//    private Collection<ItemDeReceita> itensReceita;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "consulta")
//    private Collection<ItemDeExame> itensExame;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEstcivil() {
        return estcivil;
    }

    public void setEstcivil(String estcivil) {
        this.estcivil = estcivil;
    }

    public Date getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(Date datanasc) {
        this.datanasc = datanasc;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getCartsus() {
        return cartsus;
    }

    public void setCartsus(String cartsus) {
        this.cartsus = cartsus;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Date getDatacad() {
        return datacad;
    }

    public void setDatacad(Date datacad) {
        this.datacad = datacad;
    }

    public String getNomemae() {
        return nomemae;
    }

    public void setNomemae(String nomemae) {
        this.nomemae = nomemae;
    }

    public String getNomepai() {
        return nomepai;
    }

    public void setNomepai(String nomepai) {
        this.nomepai = nomepai;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTiposang() {
        return tiposang;
    }

    public void setTiposang(String tiposang) {
        this.tiposang = tiposang;
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

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public Date getDataPrec() {
        return dataPrec;
    }

    public void setDataPrec(Date dataPrec) {
        this.dataPrec = dataPrec;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public int getNumeroordem() {
        return numeroordem;
    }

    public void setNumeroordem(int numeroordem) {
        this.numeroordem = numeroordem;
    }

    public Date getDataatend() {
        return dataatend;
    }

    public void setDataatend(Date dataatend) {
        this.dataatend = dataatend;
    }

    public Date getDataregistro() {
        return dataregistro;
    }

    public void setDataregistro(Date dataregistro) {
        this.dataregistro = dataregistro;
    }

//    public String getTipoatend() {
//        return tipoatend;
//    }
//
//    public void setTipoatend(String tipoatend) {
//        this.tipoatend = tipoatend;
//    }

    public int getNumeroordem2() {
        return numeroordem2;
    }

    public void setNumeroordem2(int numeroordem2) {
        this.numeroordem2 = numeroordem2;
    }

    public boolean isAtendmed() {
        return atendmed;
    }

    public void setAtendmed(boolean atendmed) {
        this.atendmed = atendmed;
    }

    public boolean isSituacao2() {
        return situacao2;
    }

    public void setSituacao2(boolean situacao2) {
        this.situacao2 = situacao2;
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

    public boolean isSituacao3() {
        return situacao3;
    }

    public void setSituacao3(boolean situacao3) {
        this.situacao3 = situacao3;
    }

}
