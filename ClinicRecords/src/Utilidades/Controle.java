/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Aluno
 */
public class Controle {

    protected EntityManager getEntityManger() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ClinicRecordsPU");
        return emf.createEntityManager();
    }

    public void adicionar(Object objeto) {
//        EntityManager gerEntidade;
//        gerEntidade = GerenciamentoEntidades.criarGerente();
        EntityManager em = getEntityManger();
        em.getTransaction().begin();
        em.persist(objeto);
        em.getTransaction().commit();
        em.close();
    }

    public void alterar(Object objeto) {
       EntityManager em = getEntityManger();
        em.getTransaction().begin();
        em.merge(objeto);
        em.getTransaction().commit();
        em.close();
    }

    public void excluir(Object objeto) {
        EntityManager em = getEntityManger();
        em.getTransaction().begin();
        em.remove(em.merge(objeto));
        em.getTransaction().commit();
        em.close();
    }
}
