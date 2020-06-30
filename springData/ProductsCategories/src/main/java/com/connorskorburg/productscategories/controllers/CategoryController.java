package com.connorskorburg.productscategories.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.connorskorburg.productscategories.models.Category;
import com.connorskorburg.productscategories.models.CategoryProduct;
import com.connorskorburg.productscategories.models.Product;
import com.connorskorburg.productscategories.services.CategoryProductService;
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
	
	@Autowired
	private CategoryProductService categoryProductService;
	
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
		model.addAttribute("category", category);
		model.addAttribute("products", productService.allowedProducts(category));
		model.addAttribute("cat_products", category.getProducts());
		return "WEB-INF/ShowCategory.jsp";
	}
	@RequestMapping(value="/addProductToCategory", method=RequestMethod.POST)
	public String addProductToCategory(@RequestParam(value="product_id") Long product_id, @RequestParam(value="category_id") Long category_id) {
		Category category = categoryService.findCategory(category_id);
		Product product = productService.findProduct(product_id);
		CategoryProduct categoryProduct = new CategoryProduct(product, category);
		categoryProductService.saveCatProd(categoryProduct);
		return "redirect:/categories/" + category_id;
	}
}
