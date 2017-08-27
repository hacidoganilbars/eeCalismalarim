package com.hacidoganilbars.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hacidoganilbars.entity.Calisan;

public class CreatingCalisan {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPAtut");
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();	
		Calisan emp=new Calisan();
//		emp.setId(100);
		emp.setIsim("Hacý Doðan");
		emp.setSoyIsim("Ýlbars");	
		emp.setGorev("Temizlikçi");
		emp.setMaas(1500);
		em.persist(emp);
		em.getTransaction().commit();
		
		em.getTransaction().begin();
		Calisan emp1=new Calisan();
//		emp.setId(100);
		emp1.setIsim("Mahmut");
		emp1.setSoyIsim("xyz");
		emp1.setGorev("Paspasçý");
		emp1.setMaas(2000);
		em.persist(emp1);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

}
