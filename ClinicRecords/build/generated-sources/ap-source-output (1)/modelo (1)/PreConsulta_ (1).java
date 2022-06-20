package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Consulta;
import modelo.FichaAtendimento;
import modelo.Funcionario;
import modelo.Medico;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-05T17:59:26")
@StaticMetamodel(PreConsulta.class)
public class PreConsulta_ { 

    public static volatile SingularAttribute<PreConsulta, Integer> codigo;
    public static volatile SingularAttribute<PreConsulta, Boolean> situacao;
    public static volatile SingularAttribute<PreConsulta, Double> peso;
    public static volatile SingularAttribute<PreConsulta, FichaAtendimento> fichaatend;
    public static volatile SingularAttribute<PreConsulta, Date> dataPrec;
    public static volatile SingularAttribute<PreConsulta, Integer> diastolica;
    public static volatile SingularAttribute<PreConsulta, Double> altura;
    public static volatile SingularAttribute<PreConsulta, Integer> sistolica;
    public static volatile SingularAttribute<PreConsulta, Medico> medico;
    public static volatile SingularAttribute<PreConsulta, Funcionario> funcionario;
    public static volatile SingularAttribute<PreConsulta, String> temperatura;
    public static volatile SingularAttribute<PreConsulta, Integer> numeroordem;
    public static volatile SingularAttribute<PreConsulta, Consulta> consulta;

}