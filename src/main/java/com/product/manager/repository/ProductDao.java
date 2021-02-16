package com.product.manager.repository;

import java.util.List;

import com.product.manager.model.Product;

public interface ProductDao {
	
	public void addProduct(Product product);
	public List<Product> getAllProducts();
	
	public void deleteProduct(int pid);
	
	public Product getProductById(int pid);
	
	public Product updateProduct(Product product);

}
