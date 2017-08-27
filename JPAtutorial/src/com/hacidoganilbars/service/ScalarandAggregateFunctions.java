package com.hacidoganilbars.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ScalarandAggregateFunctions {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAtut");
		EntityManager em = emf.createEntityManager();

		//Scalar function
		Query query = em.createQuery("Select UPPER(c.isim) from Calisan c");
		List<String> list = query.getResultList();
		for (String c : list) {
			System.out.println("Calýþan Ýsim: " + c);
		}

		////Aggregate function
		Query query1 = em.createQuery("Select MAX(c.maas) from Calisan c");
		Integer result = (Integer) query1.getSingleResult();
		System.out.println("MAX Maaþ: " + result);

	}

}
