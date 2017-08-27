package com.hacidoganilbars.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.hacidoganilbars.entity.Calisan;

public class Ordering {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAtut");
		EntityManager em = emf.createEntityManager();

		// Order
		Query query = em.createQuery("Select c From Calisan c ORDER BY c.isim ASC");
		List<Calisan> list = (List<Calisan>) query.getResultList();
		for (Calisan c : list) {
			System.out.print(" �al��an ID: " + c.getId());
			System.out.println("\t�al��an �sim: " + c.getIsim());
		}
		emf.close();
		em.close();
	}

}
