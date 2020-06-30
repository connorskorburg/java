package com.connorskorburg.productscategories.services;

import org.springframework.stereotype.Service;

import com.connorskorburg.productscategories.models.CategoryProduct;
import com.connorskorburg.productscategories.repositories.CategoryProductRepository;

@Service
public class CategoryProductService {
	private final CategoryProductRepository categoryProductRepository;
	public CategoryProductService(CategoryProductRepository categoryProductRepository) {
		this.categoryProductRepository = categoryProductRepository;
	}
	
	//saves a relationship
	public void saveCatProd(CategoryProduct categoryProduct) {
		categoryProductRepository.save(categoryProduct);
	}
	
	//creates relationship
	public CategoryProduct createCatProd(CategoryProduct categoryProduct) {
		return categoryProductRepository.save(categoryProduct);
	}
}
