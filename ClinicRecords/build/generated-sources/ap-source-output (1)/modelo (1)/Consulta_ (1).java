package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.ItemDeExame;
import modelo.ItemDeReceita;
import modelo.PreConsulta;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-05T17:59:26")
@StaticMetamodel(Consulta.class)
public class Consulta_ { 

    public static volatile CollectionAttribute<Consulta, ItemDeExame> itensExame;
    public static volatile SingularAttribute<Consulta, String> observacoes;
    public static volatile SingularAttribute<Consulta, Integer> codigo;
    public static volatile SingularAttribute<Consulta, PreConsulta> preconsulta;
    public static volatile SingularAttribute<Consulta, Boolean> situacao;
    public static volatile CollectionAttribute<Consulta, ItemDeReceita> itensReceita;
    public static volatile SingularAttribute<Consulta, Date> dataConsul;
    public static volatile SingularAttribute<Consulta, String> diagnostico;

}