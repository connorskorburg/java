package com.connorskorburg.productscategories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.connorskorburg.productscategories.models.Category;
import com.connorskorburg.productscategories.models.Product;
import com.connorskorburg.productscategories.repositories.ProductRepository;

@Service
public class ProductService {
	private final ProductRepository productRepository;
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	//returns all products
	public List<Product> allProducts(){
		return productRepository.findAll();
	}
	//creates a product
	public Product createProduct(Product b) {
		return productRepository.save(b);
	}
	//gets a product
	public Product findProduct(Long id) {
		Optional<Product> optionalProduct = productRepository.findById(id);
		if(optionalProduct.isPresent()) {
			return optionalProduct.get();
		} else {
			return null;
		}
	}
	//updates a product 
	public Product updateProduct(Product b) {
		return productRepository.save(b);
	}
	public Product updateProduct(Long id, String name, String description, double price) {
		Optional<Product> optionalProduct = productRepository.findById(id);
		if(optionalProduct.isPresent()){
			optionalProduct.get().setName(name);
			optionalProduct.get().setDescription(description);
			optionalProduct.get().setPrice(price);
			return optionalProduct.get();
		} else {
			return null;
		}
	}
	//finds available products
	public List<Product> allowedProducts(Category category){
		return productRepository.findByCategoriesNotContains(category);
	}
}
