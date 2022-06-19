package ManterFunc;

import ManterSetor.Setor;
import Pessoa.Pessoa_;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-10T17:03:17")
@StaticMetamodel(Funcionario.class)
public class Funcionario_ extends Pessoa_ {

    public static volatile SingularAttribute<Funcionario, String> senha;
    public static volatile SingularAttribute<Funcionario, Setor> setor;
    public static volatile SingularAttribute<Funcionario, Boolean> tipo;
    public static volatile SingularAttribute<Funcionario, String> nomeuser;

}