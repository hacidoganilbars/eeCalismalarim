package com.hacidoganilbars.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hacidoganilbars.entity.Calisan;
import com.hacidoganilbars.entity.Departman;

public class OneToOne {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityRelationship2JPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Departman departman = new Departman();
		departman.setIsim("Development");

		em.persist(departman);

		Calisan calisan = new Calisan();
		calisan.setIsim("Hacý Doðan");
		calisan.setUcret(3500);
		calisan.setVasif("Teknik Programcý");
		calisan.setDepartman(departman);

		em.persist(calisan);
		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
