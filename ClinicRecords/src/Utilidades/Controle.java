/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import javax.persistence.EntityManager;


/**
 *
 * @author Aluno
 */
public class Controle {

    protected EntityManager getEntityManger() {
        
        return GerenciamentoEntidades.getFabEntidades().createEntityManager();
    }

    public void adicionar(Object objeto) {
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
