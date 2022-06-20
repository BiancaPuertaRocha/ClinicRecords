package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Consulta;
import modelo.Medicamento;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-06T15:48:49")
@StaticMetamodel(ItemDeReceita.class)
public class ItemDeReceita_ { 

    public static volatile SingularAttribute<ItemDeReceita, Integer> codigo;
    public static volatile SingularAttribute<ItemDeReceita, Medicamento> medicamento;
    public static volatile SingularAttribute<ItemDeReceita, String> periodicidade;
    public static volatile SingularAttribute<ItemDeReceita, Consulta> consulta;
    public static volatile SingularAttribute<ItemDeReceita, String> dosagem;

}