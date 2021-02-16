package com.product.manager.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.product.manager.model.Product;
import com.product.manager.service.ProductService;

@Controller

public class ProductController {
	
	
	
	@Autowired
	private ProductService productService;
	
	
	@RequestMapping(path="/product",method=RequestMethod.GET)
	public ModelAndView getProduct(ModelAndView m) {
		List<Product> product=productService.getAllProducts();
		m.addObject("products",product);
		m.setViewName("product-list");
		return m;
	}
	
	@RequestMapping("/viewemp")    
    public String viewemp(Model m){    
        List<Product> list=productService.getAllProducts();    
        m.addAttribute("products",list);  
        return "product-list";    
    }
	@RequestMapping(value = "/newProduct", method = RequestMethod.GET)
    public ModelAndView newProduct(ModelAndView model) {
        Product product = new Product();
        model.addObject("product", product);
        model.setViewName("product-form");
        return model;
    }

	
	@RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
    public ModelAndView saveProduct(@ModelAttribute Product product) {
        if (product.getPid()== 0) { // if employee id is 0 then creating the
            // employee other updating the employee
            productService.addProduct(product);
        } else {
            productService.updateProduct(product);
        }
        return new ModelAndView("redirect:/product");
    }
	
	@RequestMapping(value = "/deleteProduct", method = RequestMethod.GET)
    public ModelAndView deleteEmployee(HttpServletRequest request) {
        int pId = Integer.parseInt(request.getParameter("pid"));
        productService.deleteProduct(pId);
        return new ModelAndView("redirect:/product");
    }
 
    @RequestMapping(value = "/editProduct", method = RequestMethod.GET)
    public ModelAndView editContact(HttpServletRequest request) {
        int pId = Integer.parseInt(request.getParameter("pid"));
        Product  product = productService.getProductById(pId);
        ModelAndView model = new ModelAndView("product-edit");
        model.addObject("product", product);
 
        return model;
    }
 

}
