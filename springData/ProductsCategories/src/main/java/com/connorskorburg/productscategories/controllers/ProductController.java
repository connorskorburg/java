package com.connorskorburg.productscategories.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.connorskorburg.productscategories.models.Product;
import com.connorskorburg.productscategories.services.CategoryService;
import com.connorskorburg.productscategories.services.ProductService;

@Controller
public class ProductController {
	private final ProductService productService;
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("/products/new")
	public String newProduct() {
		return "WEB-INF/NewProduct.jsp";
	}
	@RequestMapping(value="/createProduct", method=RequestMethod.POST)
	public String createProduct(@RequestParam(value="name") String name, @RequestParam(value="description") String description, @RequestParam(value="price") double price) {
		Product product = new Product(name, description, price);
		productService.createProduct(product);
		return "redirect:/products/" + product.getId();
	}
	@RequestMapping("/products/{id}")
	public String showProduct(@PathVariable(value="id") Long id, Model model) {
		Product product = productService.findProduct(id);
		model.addAttribute("product", product);
		model.addAttribute("categories", categoryService.allowedCategories(product));
		return "WEB-INF/ShowProduct.jsp";
	}
	@RequestMapping(value="/addCategoryToProduct", method=RequestMethod.POST)
	public String addCategoryToProduct(@RequestParam(value="category_id") Long category_id, @RequestParam(value="product_id") Long product_id) {
		System.out.println("category id " + category_id);
		System.out.println("product id " + product_id);
		return "redirect:/products/" + product_id;
	}
}
