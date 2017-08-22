package com.hacidoganilbars.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hacidoganilbars.entity.Person;
 
public class PersistOperation {
    public static void main(String[] args) {
        
        EntityManagerFactory entityManagerFactoryObject=Persistence.createEntityManagerFactory("JPALessons");
        EntityManager entityManagerObject=entityManagerFactoryObject.createEntityManager();
        
        Person person=new Person(); 
        person.setName("Doðan"); 
        person.setSurname("Ýlbars"); 
 
        try 
        {
             entityManagerObject.getTransaction().begin();
             entityManagerObject.persist(person);
             entityManagerObject.getTransaction().commit();
             entityManagerObject.close();
             entityManagerFactoryObject.close();
             System.out.println("Record was inserted successfully!");
        } 
        catch (Exception e) 
        {
            System.err.println("An Error Occured. Error is:"+e);
        }
    }
}