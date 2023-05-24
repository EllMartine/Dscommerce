package com.gbotelho.dscommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gbotelho.dscommerce.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
