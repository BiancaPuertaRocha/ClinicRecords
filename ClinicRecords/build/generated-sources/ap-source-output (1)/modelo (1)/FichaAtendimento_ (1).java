package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Pessoa;
import modelo.PreConsulta;
import modelo.TipoAtendi;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-06T15:48:49")
@StaticMetamodel(FichaAtendimento.class)
public class FichaAtendimento_ { 

    public static volatile SingularAttribute<FichaAtendimento, Date> dataregistro;
    public static volatile SingularAttribute<FichaAtendimento, Integer> codigo;
    public static volatile SingularAttribute<FichaAtendimento, Boolean> situacao;
    public static volatile SingularAttribute<FichaAtendimento, Pessoa> paciente;
    public static volatile SingularAttribute<FichaAtendimento, TipoAtendi> tipoatend;
    public static volatile SingularAttribute<FichaAtendimento, Pessoa> funcionario;
    public static volatile SingularAttribute<FichaAtendimento, Integer> numeroordem;
    public static volatile SingularAttribute<FichaAtendimento, Date> dataatend;
    public static volatile SingularAttribute<FichaAtendimento, PreConsulta> preConsulta;
    public static volatile SingularAttribute<FichaAtendimento, Boolean> atendmed;

}