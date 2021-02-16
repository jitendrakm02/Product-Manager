package com.product.manager.repository;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.product.manager.model.Product;

@Repository
public class IProductDao implements ProductDao {
	
	@Autowired
	SessionFactory sessionFactory;

	public void addProduct(Product product) {
		sessionFactory.getCurrentSession().saveOrUpdate(product);
	}
	@SuppressWarnings("unchecked")
	public List<Product> getAllProducts() {
		
		
		List<Product> list=sessionFactory.getCurrentSession().createQuery("from Product").list();
		return list;
	}

	public void deleteProduct(int pid) {
		Product p=sessionFactory.getCurrentSession().load(Product.class, pid);
		
		if(p!=null) {
			this.sessionFactory.getCurrentSession().delete(p);
		}
		
	}

	public Product getProductById(int pid) {
	Product p=sessionFactory.getCurrentSession().load(Product.class, pid);
		return p;
	}

	public Product updateProduct(Product product) {
		sessionFactory.getCurrentSession().update(product);
		return product;
	}

}
