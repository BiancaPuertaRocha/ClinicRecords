package Utilidades;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GerenciamentoEntidades {
    

    private static EntityManagerFactory fabEntidades;

    public GerenciamentoEntidades() {
    }

    public static EntityManagerFactory getFabEntidades()
    {
        // verifica se a fábrica de entidades não foi criada
        if (fabEntidades==null)
        {
            // criando a fábrica de entidades
            fabEntidades = Persistence.createEntityManagerFactory("ClinicRecordsPU");
        }
        return fabEntidades;
    }
    
    public static EntityManager criarGerenteEntidade()
    {
        if (fabEntidades==null)
        {
            fabEntidades = Persistence.createEntityManagerFactory("ClinicRecordsPU");
        }        
        return fabEntidades.createEntityManager();  
}
}