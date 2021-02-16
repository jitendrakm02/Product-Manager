package com.product.manager.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.product.manager.model.Product;
import com.product.manager.repository.ProductDao;

@Service
@Transactional
public class IProductService implements ProductService {
	
	@Autowired
	ProductDao productDao;
	
	public void setProductDao(ProductDao productDao) {
		this.productDao=productDao;
	}
 
	@Transactional
	public void addProduct(Product product) {
		productDao.addProduct(product);
	}

	public List<Product> getAllProducts() {
		
		return  productDao.getAllProducts();
	}

	public void deleteProduct(int pid) {
		productDao.deleteProduct(pid);
		
	}

	public Product getProductById(int pid) {
		// TODO Auto-generated method stub
		return productDao.getProductById(pid);
	}

	@Transactional
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return productDao.updateProduct(product);
	}

	
}
