package com.hacidoganilbars.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hacidoganilbars.entity.Calisan;

public class IslemCalisan {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("CriteriaJPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Calisan c = new Calisan(1, "Osman", 3.700, "��f�r");
		Calisan c1 = new Calisan(2, "�zlem", 3.500, "�pretmen");
		Calisan c2 = new Calisan(3, "Ahmet", 4.500, "Doktor");
		Calisan c3 = new Calisan(4, "Mustafa", 2.300, "Y�kamac�");
		Calisan c4 = new Calisan(5, "R�za", 5.500, "Esnaf");
		em.persist(c);
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		em.persist(c4);
		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
