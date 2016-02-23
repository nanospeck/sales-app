package org.nanospeck.dao.product.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.nanospeck.common.dto.ProductDTO;
import org.nanospeck.dao.product.ProductDAO;
import org.nanospeck.model.entity.Customer;
import org.nanospeck.model.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("productDao")
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public ProductDTO getProduct(Integer id) {
		ProductDTO pd = new ProductDTO();
		pd.setName("iphone");
		return pd;
	}

	@Override
	public void addProduct(Product product) {
		sessionFactory.getCurrentSession().save(product);

	}

	@Override
	public List<Product> listProduct() {
		return sessionFactory.getCurrentSession().createQuery("from PRODUCT")
				.list();
	}

	@Override
	public void removeProduct(Integer id) {
		Product product = (Product) sessionFactory.getCurrentSession().load(
				Product.class, id);
		if (null != product) {
			sessionFactory.getCurrentSession().delete(product);
		}
	}

}
