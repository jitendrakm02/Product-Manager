package com.product.manager.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name="products")
@Proxy(lazy = false)
public class Product implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	@Column(name="product_name",length = 50)
	private String pname;
	@Column(name="product_type")
	private String ptype;
	@Column(name="product_description" ,length = 800)
	private String pdescription;
	@Column(name="product_price")
	private double price;
	@Column(name="product_quantity")
	private int pquantity;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected Product( String pname, String ptype, String pdescription, double price, int pquantity) {
		super();
	
		this.pname = pname;
		this.ptype = ptype;
		this.pdescription = pdescription;
		this.price = price;
		this.pquantity = pquantity;
	}
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	 public String getPname() {
		 return pname;
	 }
	 public void setPname(String pname) {
		 this.pname=pname;
	 }
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	public String getPdescription() {
		return pdescription;
	}
	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPquantity() {
		return pquantity;
	}
	public void setPquantity(int pquantity) {
		this.pquantity = pquantity;
	}
	
	

}
