package com.hacidoganilbars.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hacidoganilbars.entity.Calisan;
import com.hacidoganilbars.entity.Departman;

public class OneToMany {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityRelationship1JPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Calisan cal = new Calisan();
		cal.setIsim("Musa");
		cal.setUcret(3500);
		cal.setVasif("Çevirmen");

		Calisan cal1 = new Calisan();
		cal1.setIsim("Veysel");
		cal1.setUcret(3000);
		cal1.setVasif("Güvenlik");

		Calisan cal2 = new Calisan();
		cal2.setIsim("Faruk");
		cal2.setUcret(3250);
		cal2.setVasif("Aþçý");

		em.persist(cal);
		em.persist(cal1);
		em.persist(cal2);

		List<Calisan> calisanList = new ArrayList<Calisan>();
		calisanList.add(cal);
		calisanList.add(cal1);
		calisanList.add(cal2);

		Departman dep = new Departman();
		dep.setDepartmanIsim("Hizmetler");
		dep.setCalisanList(calisanList);

		em.persist(dep);
		em.getTransaction().commit();

		em.close();
		emf.close();

	}

}
