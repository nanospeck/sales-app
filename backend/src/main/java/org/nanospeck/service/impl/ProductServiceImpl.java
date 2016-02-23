package org.nanospeck.service.impl;

import org.nanospeck.common.dto.ProductDTO;
import org.nanospeck.dao.ProductDAO;
import org.nanospeck.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service ("productService")
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductDAO productDAO ;
	
	@Override
	public ProductDTO getProduct(Integer id) {
		return productDAO.getProduct(id);
	}

}
