package org.nanospeck.dao.impl;

import org.nanospeck.common.dto.ProductDTO;
import org.nanospeck.dao.ProductDAO;
import org.springframework.stereotype.Repository;


@Repository ("productDao")
public class ProductDAOImpl implements ProductDAO{


	@Override
	public ProductDTO getProduct(Integer id) {
		ProductDTO pd = new ProductDTO();
		pd.setName("iphone");
		return pd;
	}

}
