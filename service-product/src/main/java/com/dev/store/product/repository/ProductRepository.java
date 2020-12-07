package com.dev.store.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.store.product.entity.Category;
import com.dev.store.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	public List<Product> findByCategory(Category category);
	
}
