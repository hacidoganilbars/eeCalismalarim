package com.hacidoganilbars.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.hacidoganilbars.entity.Mudur;
import com.hacidoganilbars.entity.Ogrenci;
import com.hacidoganilbars.entity.Ogretmen;

public class DAO {
	public EntityManager em;
	EntityManagerFactory emf;

	public void connection() {
		emf = Persistence.createEntityManagerFactory("OkulYonetim");
		em = emf.createEntityManager();
	}

	public void save(Object obj) {
		em.getTransaction().begin();
		em.persist(obj);
		em.getTransaction().commit();
	}

	public void ogrenciSil(Object obj) {
		em.getTransaction().begin();
		em.remove(obj);
		em.getTransaction().commit();
	}

	public List<Ogrenci> ogrList() {

		TypedQuery<Ogrenci> ogrQuery = em.createQuery("SELECT o FROM Ogrenci o", Ogrenci.class);
		List<Ogrenci> ogrenciList = ogrQuery.getResultList();
		System.out.println("\n---------OGRENCÝ LÝSTESÝ---------");
		for (Ogrenci o : ogrenciList) {
			System.out.println(o.getId() + " " + o.getIsim() + " " + o.getSoyIsim() + " " + o.getSinifi());
		}
		System.out.println("---------------------------------\n");

		return null;
	}

	public List<Ogretmen> ogrtList() {
		TypedQuery<Ogretmen> ogrtQuery = em.createQuery("SELECT o FROM Ogretmen o", Ogretmen.class);
		List<Ogretmen> ogretmenList = ogrtQuery.getResultList();
		System.out.println("\n---------OGRETMEN LÝSTESÝ---------");
		for (Ogretmen o : ogretmenList) {
			System.out.println(o.getId() + " " + o.getIsim() + " " + o.getSoyIsim() + " " + o.getBrans());
		}
		System.out.println("---------------------------------\n");
		return null;
	}

	public List<Mudur> mudList() {
		TypedQuery<Mudur> mudQuery = em.createQuery("SELECT m FROM Mudur m", Mudur.class);
		List<Mudur> mudurList = mudQuery.getResultList();
		System.out.println("\n---------MUDUR LÝSTESÝ---------");
		for (Mudur m : mudurList) {
			System.out.println(m.getId() + " " + m.getIsim() + " " + m.getSoyIsim());
		}
		System.out.println("---------------------------------\n");
		return null;
	}

}
