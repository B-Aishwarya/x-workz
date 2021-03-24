package com.xworkz.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.xworkz.entity.ContactForm;
import com.xworkz.util.EMUtil;

public class ContactDaoImpl implements ContactFormDao {

	@Override
	public void save(ContactForm entity) {
		System.out.println("invoked create method");
		System.out.println("entity:" + entity);

		// EntityManager session = null;

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz_interior.jpa");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		session.persist(entity);
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public Object findByName(String name) {
		EntityManager session = null;
		System.out.println("created findByName");
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz_interior.jpa");
			session = factory.createEntityManager();
			session.getTransaction().begin();
			Query query = session.createNamedQuery("findByName");
			query.setParameter("nm", name);
			Object result = query.getSingleResult();
			return result;
		} finally {
			session.close();
		}

	}

	@Override
	public ContactForm findByEmail(String email) {
		EntityManager session = null;
		System.out.println("created findByEmail");
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz_interior.jpa");
			session = factory.createEntityManager();
			Query query = session.createNamedQuery("findByEmail");
			query.setParameter("email", email);
			ContactForm result = (ContactForm) query.getSingleResult();
			return result;
		} finally {
			session.close();
		}

	}
	@Override
	public List<ContactForm> findAll() {
		EntityManager session = null;
		System.out.println("created findAll");
		
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz_interior.jpa");
			session = factory.createEntityManager();
			Query query = session.createNamedQuery("findAll");
		      List<ContactForm> form= query.getResultList();
		      System.out.println(form);
			session.close();
		
		return form;
}
}
