package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Consulta;
import modelo.Exame;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-06T15:48:49")
@StaticMetamodel(ItemDeExame.class)
public class ItemDeExame_ { 

    public static volatile SingularAttribute<ItemDeExame, Exame> exame;
    public static volatile SingularAttribute<ItemDeExame, Integer> codigo;
    public static volatile SingularAttribute<ItemDeExame, Consulta> consulta;

}