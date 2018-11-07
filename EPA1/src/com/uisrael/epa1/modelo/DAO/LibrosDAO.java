/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.epa1.modelo.DAO;

import com.uisrael.epa1.modelo.entidades.Libros;
import java.util.ArrayList;
import java.util.List;
import javax.naming.ldap.ManageReferralControl;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Asus
 */
public class LibrosDAO {
     private static EntityManager getEntityManger() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EPA1PU");
        EntityManager em = emf.createEntityManager();
        return em;
    }
     public void insertarLibro(Libros libro ){
           
       try{
        EntityManager em = getEntityManger();
        if(em.isOpen()){
            System.out.println("Cambio exitoso");
            
        }else{
            System.err.println("Error revise la conexcion a la base de datos"); 
        }
                  
        EntityTransaction etx = em.getTransaction();
        etx.begin();
        em.persist(libro);
        etx.commit();
        
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public List<Libros> ListarLibros(){
        List<Libros> resultado;
        try{
        EntityManager em = getEntityManger();
        if(em.isOpen()){
            System.out.println("Listando");
            
        }else{
            System.err.println("Error revise la conexcion a la base de datos"); 
        }
        CriteriaBuilder builder = em.getCriteriaBuilder();
            CriteriaQuery<Libros> query = builder.createQuery(Libros.class);
            Root<Libros> from = query.from(Libros.class);
            
            TypedQuery<Libros> typedQuery = em.createQuery(query.select(from));
            resultado = typedQuery.getResultList();
        
        } catch(Exception ex){
            resultado = new ArrayList();
        }
        return resultado;
    }
}
