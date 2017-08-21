package com.hacidoganilbars.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hacidoganilbars.entity.Ogrenci;


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
	
	public List<Ogrenci> getOgrenci() {
	return  em.createQuery("SELECT u FROM Ogrenci u").getResultList();
}

}
