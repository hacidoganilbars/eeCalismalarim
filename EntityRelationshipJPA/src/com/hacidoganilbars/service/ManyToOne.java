package com.hacidoganilbars.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hacidoganilbars.entity.Calisan;
import com.hacidoganilbars.entity.Departman;

public class ManyToOne {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityRelationshipJPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		// create Departman entity
		Departman dep = new Departman();
		dep.setIsim("Development");

		// store Departman
		em.persist(dep);

		Calisan cal = new Calisan();
		cal.setCalisanIsim("Hacý Doðan");
		cal.setVasif("Developer");
		cal.setMaas(2000);
		cal.setDepartman(dep);

		Calisan cal1 = new Calisan();
		cal1.setCalisanIsim("Veli");
		cal1.setMaas(45000);
		cal1.setVasif("Technical Writer");
		cal1.setDepartman(dep);

		Calisan cal2 = new Calisan();
		cal2.setCalisanIsim("Osman");
		cal2.setMaas(45000);
		cal2.setVasif("Technical Writer");
		cal2.setDepartman(dep);

		em.persist(cal);
		em.persist(cal1);
		em.persist(cal2);

		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
