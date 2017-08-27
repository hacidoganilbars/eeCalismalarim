package com.hacidoganilbars.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.hacidoganilbars.entity.Calisan;

public class CriteriaApi {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("CriteriaJPA");
		EntityManager em = emf.createEntityManager();
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		CriteriaQuery<Object> criteriaQuery = criteriaBuilder.createQuery();
		Root<Calisan> from = criteriaQuery.from(Calisan.class);

		System.out.println("Select All Records");
		CriteriaQuery<Object> select = criteriaQuery.select(from);
		TypedQuery<Object> typedQuery = em.createQuery(select);
		List<Object> resultList = typedQuery.getResultList();

		for (Object o : resultList) {
			Calisan c = (Calisan) o;
			System.out.println("Çalýþan Id: " + c.getCid() + " Çalýþan Ýsim: " + c.getCIsim());
		}

		System.out.println("Select all records by follow ordering");
		CriteriaQuery<Object> select1 = criteriaQuery.select(from);
		select1.orderBy(criteriaBuilder.asc(from.get("cIsim")));
		TypedQuery<Object> typedQuery1 = em.createQuery(select1);
		List<Object> resultList1 = typedQuery1.getResultList();

		for (Object o : resultList1) {
			Calisan c = (Calisan) o;
			System.out.println("Çalýþan Id: " + c.getCid() + "Çalýþan Ýsim: " + c.getCIsim());
		}

		em.close();
		emf.close();

	}

}
