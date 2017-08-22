package com.hacidoganilbars.main;

import java.util.List;
import javax.persistence.TypedQuery;
import com.hacidoganilbars.dao.DAO;
import com.hacidoganilbars.entity.Person;

public class IslemQuery {
	public static void main(String[] args) {
		DAO dao = new DAO();
		dao.connect();

		TypedQuery<Person> personQuery = dao.em.createQuery("SELECT p FROM Person p", Person.class);
		List<Person> personList = personQuery.getResultList();

		for (Person person : personList) {

			System.out.println(person.getId() + " " + person.getName() + " " + person.getSurname());

		}

	}

}
