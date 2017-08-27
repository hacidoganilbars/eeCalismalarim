package com.hacidoganilbars.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hacidoganilbars.entity.DigerPersonel;
import com.hacidoganilbars.entity.TeknikPersonel;

public class KayitPersonel {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JoinedStrategyJPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		TeknikPersonel tp = new TeknikPersonel("Hacý Doðan", "Programci", "Java");
		TeknikPersonel tp1 = new TeknikPersonel("Hakan Ceylan", "Sistemci", "Server");

		DigerPersonel dp = new DigerPersonel("Osman", "Muhasebeci");
		DigerPersonel dp1 = new DigerPersonel("Mahmut", "Çaycý");

		em.persist(tp);
		em.persist(tp1);
		em.persist(dp);
		em.persist(dp1);

		em.getTransaction().commit();

		em.close();
		emf.close();

	}

}
