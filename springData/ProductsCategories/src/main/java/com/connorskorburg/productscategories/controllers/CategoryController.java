package com.connorskorburg.productscategories.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.connorskorburg.productscategories.models.Category;
import com.connorskorburg.productscategories.models.Product;
import com.connorskorburg.productscategories.services.CategoryService;
import com.connorskorburg.productscategories.services.ProductService;

@Controller
public class CategoryController {
	final private CategoryService categoryService;
	
	public CategoryController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/categories/new")
	public String newCategory() {
		return "WEB-INF/NewCategory.jsp";
	}
	@RequestMapping(value="/createCategory", method=RequestMethod.POST)
	public String createCategory(@RequestParam(value="name") String name) {
		Category category = new Category(name);
		categoryService.createCategory(category);
		return "redirect:/categories/" + category.getId();
	}
	@RequestMapping("/categories/{id}")
	public String showCategory(@PathVariable(value="id") Long id, Model model) {
		Category category = categoryService.findCategory(id);
		List<Product> products = productService.allProducts();
		model.addAttribute("category", category);
		model.addAttribute("products", products);
		return "WEB-INF/ShowCategory.jsp";
	}
}
