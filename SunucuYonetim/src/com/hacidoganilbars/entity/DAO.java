package com.hacidoganilbars.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO {
	EntityManager em;

	public void connection() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SunucuYonetimi");
		em = emf.createEntityManager();
	}

	public void save(Object obj) {
		em.getTransaction().begin();
		em.persist(obj);
		em.getTransaction().commit();

	}

}
