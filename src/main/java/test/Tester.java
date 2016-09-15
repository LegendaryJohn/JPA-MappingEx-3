/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author kann
 */
public class Tester {
    
        public static void main(String[] args) {
        
        Persistence.generateSchema("JPAex3", null);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAex3");
        EntityManager em = emf.createEntityManager(); 
        
   
        em.getTransaction().begin();
        
        
        em.getTransaction().commit();
        
        em.close();
        
        }   
    
}
