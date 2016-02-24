package org.nanospeck.dao.order.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.nanospeck.dao.order.OrderDAO;
import org.nanospeck.model.entity.Customer;
import org.nanospeck.model.entity.OrderLine;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderDAOImpl implements OrderDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addOrderLine(OrderLine order) {
		sessionFactory.getCurrentSession().save(order);

	}

	@Override
	public List<OrderLine> listOrder() {
		return sessionFactory.getCurrentSession().createQuery("from ORDER")
				.list();
	}

	@Override
	public void removeOrder(Integer id) {
		OrderLine order = (OrderLine) sessionFactory.getCurrentSession().load(
				OrderLine.class, id);
		if (null != order) {
			sessionFactory.getCurrentSession().delete(order);
		}

	}

}
