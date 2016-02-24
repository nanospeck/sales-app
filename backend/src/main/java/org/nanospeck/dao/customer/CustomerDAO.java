package org.nanospeck.dao.customer;

import java.util.List;

import org.nanospeck.model.entity.Customer;

public interface CustomerDAO {

	public void addCustomer(Customer customer);

	public List<Customer> listCustomer();

	public void removeContact(Integer id);
}
