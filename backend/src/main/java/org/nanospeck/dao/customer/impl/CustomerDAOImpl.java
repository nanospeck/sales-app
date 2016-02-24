package org.nanospeck.dao.customer.impl;

import java.util.List;


import org.hibernate.SessionFactory;
import org.nanospeck.dao.customer.CustomerDAO;
import org.nanospeck.model.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addCustomer(Customer customer) {
		sessionFactory.getCurrentSession().save(customer);

	}

	@Override
	public List<Customer> listCustomer() {
		return sessionFactory.getCurrentSession().createQuery("from CUSTOMER")
				.list();
	}

	@Override
	public void removeContact(Integer id) {
		Customer customer = (Customer) sessionFactory.getCurrentSession().load(
				Customer.class, id);
		if (null != customer) {
			sessionFactory.getCurrentSession().delete(customer);
		}

	}

}
