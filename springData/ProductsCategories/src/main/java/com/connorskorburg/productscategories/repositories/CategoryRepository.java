package com.connorskorburg.productscategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.connorskorburg.productscategories.models.Category;
import com.connorskorburg.productscategories.models.Product;
@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
	List<Category> findAll();
	List<Category> findByProductsNotContains(Product product);
	void deleteById(Long id);
}
