package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Setor;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-22T08:30:42")
@StaticMetamodel(Funcionario.class)
public class Funcionario_ extends Pessoa_ {

    public static volatile SingularAttribute<Funcionario, String> senha;
    public static volatile SingularAttribute<Funcionario, Setor> setor;
    public static volatile SingularAttribute<Funcionario, Boolean> tipo;
    public static volatile SingularAttribute<Funcionario, String> nomeuser;

}