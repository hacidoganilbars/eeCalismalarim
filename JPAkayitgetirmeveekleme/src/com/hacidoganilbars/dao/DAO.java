package com.hacidoganilbars.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO {
	public EntityManager em;
	
	public void connect() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPALessons");
		em=emf.createEntityManager();
	}
	public void save(Object obj) {
		em.getTransaction().begin();
		em.persist(obj);
		em.getTransaction().commit();
	}

}
