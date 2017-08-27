package com.hacidoganilbars.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hacidoganilbars.entity.Calisan;

public class DeletingCalisan {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAtut");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Calisan calisan = em.find(Calisan.class, 2);
		em.remove(calisan);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
