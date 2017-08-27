package com.hacidoganilbars.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hacidoganilbars.entity.DigerPersonel;
import com.hacidoganilbars.entity.TeknikPersonel;

public class KayitPersonel {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("TablePerClassStrategyJPA");
		EntityManager em= emf.createEntityManager();
		em.getTransaction().begin();
		
		DigerPersonel dp= new DigerPersonel("Hasan Uzun", "Satýþ Elemaný");
		DigerPersonel dp1=new DigerPersonel("Yasin Kýsa", "Sekreter");
		
		TeknikPersonel tp= new TeknikPersonel("Ýsa", "programcý", "sql");
		TeknikPersonel tp1=new TeknikPersonel("Hayri","Sistemci","Serverlar");
		
		em.persist(dp);
		em.persist(dp1);
		em.persist(tp);
		em.persist(tp1);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

}
