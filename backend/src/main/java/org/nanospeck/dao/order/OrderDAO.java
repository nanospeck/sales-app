package org.nanospeck.dao.order;

import java.util.List;

import org.nanospeck.model.entity.OrderLine;

public interface OrderDAO {

	public void addOrderLine(OrderLine order);

	public List<OrderLine> listOrder();

	public void removeOrder(Integer id);
}
