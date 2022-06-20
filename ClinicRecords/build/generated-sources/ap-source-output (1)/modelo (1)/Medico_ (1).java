package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-22T08:30:42")
@StaticMetamodel(Medico.class)
public class Medico_ extends Pessoa_ {

    public static volatile SingularAttribute<Medico, String> senha;
    public static volatile SingularAttribute<Medico, String> especialidade;
    public static volatile SingularAttribute<Medico, Integer> maxatendi;
    public static volatile SingularAttribute<Medico, String> nomeuser;
    public static volatile SingularAttribute<Medico, String> crm;

}