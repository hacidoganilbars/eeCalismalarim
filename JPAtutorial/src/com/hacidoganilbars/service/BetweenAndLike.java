package com.hacidoganilbars.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.hacidoganilbars.entity.Calisan;

public class BetweenAndLike {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAtut");
		EntityManager em = emf.createEntityManager();

		// Between
		Query query = em.createQuery("Select c from Calisan c where c.maas Between 3000 and 4000");
		List<Calisan> list = (List<Calisan>) query.getResultList();
		for (Calisan c : list) {
			System.out.print("Çalýþan ID: " + c.getId());
			System.out.println("\tÇalýþan Maaþ: " + c.getMaas());
		}

		// Like
		Query query1 = em.createQuery("Select c from Calisan c where c.isim Like 'M%' ");
		List<Calisan> list1 = (List<Calisan>) query1.getResultList();
		for (Calisan c : list1) {
			System.out.print("Çalýþan ID: " + c.getId());
			System.out.println("Çalýþan Ýsim: " + c.getIsim());
		}

	}
}
