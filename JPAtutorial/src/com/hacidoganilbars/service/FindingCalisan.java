package com.hacidoganilbars.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hacidoganilbars.entity.Calisan;

public class FindingCalisan {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAtut");
		EntityManager em = emf.createEntityManager();

		Calisan calisan = em.find(Calisan.class, 1);

		System.out.println("ID: " + calisan.getId());
		System.out.println("Ýsim: " + calisan.getIsim());
		System.out.println("Soy Ýsim: " + calisan.getSoyIsim());
		System.out.println("Görev: " + calisan.getGorev());
		System.out.println("Maaþ: " + calisan.getMaas());

		em.close();
		emf.close();
	}
}
