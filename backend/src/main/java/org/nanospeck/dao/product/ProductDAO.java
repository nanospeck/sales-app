package org.nanospeck.dao.product;

import java.util.List;

import org.nanospeck.common.dto.ProductDTO;
import org.nanospeck.model.entity.Product;

public interface ProductDAO {

	public ProductDTO getProduct(Integer id);

	public void addProduct(Product customer);

	public List<Product> listProduct();

	public void removeProduct(Integer id);

}
