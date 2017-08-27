package com.hacidoganilbars.service;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hacidoganilbars.entity.Ogretmen;
import com.hacidoganilbars.entity.Sinif;

public class ManyToMany {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityRelationship3JPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Sinif sinif1 = new Sinif(0, "1.A", null);
		Sinif sinif2 = new Sinif(0, "2.A", null);
		Sinif sinif3 = new Sinif(0, "3.A", null);

		em.persist(sinif1);
		em.persist(sinif2);
		em.persist(sinif3);

		Set<Sinif> sinifSet1 = new HashSet<Sinif>();
		sinifSet1.add(sinif1);
		sinifSet1.add(sinif2);
		sinifSet1.add(sinif3);

		Set<Sinif> sinifSet2 = new HashSet<Sinif>();
		sinifSet2.add(sinif1);
		sinifSet2.add(sinif2);
		sinifSet2.add(sinif3);

		Set<Sinif> sinifSet3 = new HashSet<Sinif>();
		sinifSet3.add(sinif1);
		sinifSet3.add(sinif2);
		sinifSet3.add(sinif3);

		Ogretmen ogretmen1 = new Ogretmen(0, "Mustafa Ergan", "Adv Java", sinifSet1);
		Ogretmen ogretmen2 = new Ogretmen(0, "Hilal Elmas", "Java", sinifSet2);
		Ogretmen ogretmen3 = new Ogretmen(0, "Ünal Dýraz", "Müzik", sinifSet3);

		em.persist(ogretmen1);
		em.persist(ogretmen2);
		em.persist(ogretmen3);

		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
