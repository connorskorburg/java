package com.connorskorburg.productscategories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.connorskorburg.productscategories.models.Category;
import com.connorskorburg.productscategories.models.Product;
import com.connorskorburg.productscategories.repositories.CategoryRepository;

@Service
public class CategoryService {
	private CategoryRepository categoryRepository;
	
	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	//returns all categories
	public List<Category> allCategories(){
		return categoryRepository.findAll();
	}
	//creates a category
	public Category createCategory(Category b) {
		return categoryRepository.save(b);
	}
	//gets a category
	public Category findCategory(Long id) {
		Optional<Category> optionalCategory = categoryRepository.findById(id);
		if(optionalCategory.isPresent()) {
			return optionalCategory.get();
		} else {
			return null;
		}
	}
	//updates a category
	public Category updateCategory(Category b) {
		return categoryRepository.save(b);
	}
	public Category updateCategory(Long id, String name) {
		Optional<Category> optionalCategory = categoryRepository.findById(id);
		if(optionalCategory.isPresent()) {
			optionalCategory.get().setName(name);
			return optionalCategory.get();
		} else {
			return null;
		}
	}
	//deletes a category
	public void deleteCategory(Long id) {
		categoryRepository.deleteById(id);
	}
	
	//find available categories
	public List<Category> allowedCategories(Product product){
		return categoryRepository.findByProductsNotContains(product);
	}
}
