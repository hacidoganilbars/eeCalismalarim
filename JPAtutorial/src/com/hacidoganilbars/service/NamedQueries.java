package com.hacidoganilbars.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.hacidoganilbars.entity.Calisan;

public class NamedQueries {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAtut");
		EntityManager em = emf.createEntityManager();
		Query query = em.createNamedQuery("find Calisan by id");
		
		query.setParameter("id", 1204);
		List<Calisan> list = query.getResultList();
		
		for (Calisan c : list) {
			System.out.print("Çalýþan ID: " + c.getId());
			System.out.println("\tÇalýþan Ýsim: " + c.getIsim());
		}

	}

}
