package com.product.manager.service;

import java.util.List;

import com.product.manager.model.Product;

public interface ProductService {
	
	public void addProduct(Product product);
	public List<Product> getAllProducts();
	
	public void deleteProduct(int pId);
	
	public Product getProductById(int pId);
	
	public Product updateProduct(Product product);

}
