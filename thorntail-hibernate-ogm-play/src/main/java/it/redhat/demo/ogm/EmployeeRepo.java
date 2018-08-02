package it.redhat.demo.ogm;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

public class EmployeeRepo {

	@PersistenceContext
	private EntityManager em;

	public void add(Integer id, String name) {
		em.persist( new Employee( id, name ) );
	}

	@Transactional
	public Employee load(Integer id) {
		return em.find( Employee.class, id );
	}

}
