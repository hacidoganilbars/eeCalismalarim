package com.hacidoganilbars.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.hacidoganilbars.entity.DigerPersonel;
import com.hacidoganilbars.entity.TeknikPersonel;

public class KayitPersonel {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("SingleStrategyJPA");
		EntityManager em= emf.createEntityManager();	
		em.getTransaction().begin();
		
		//Teknik Personel entity
		TeknikPersonel tp=new TeknikPersonel("Hakký", "Programcý", "JAVA");
		TeknikPersonel tp1=new TeknikPersonel("Osman", "Sistemci", "Serverlar");
		
		DigerPersonel dp=new DigerPersonel( "Selim", "Temizlikçi");
		DigerPersonel dp1=new DigerPersonel( "Emrah", "Muhasebe");
		
		
		em.persist(tp);
		em.persist(tp1);
		em.persist(dp);
		em.persist(dp1);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		
		
	}

}
