package com.gbotelho.dscommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gbotelho.dscommerce.dto.ProductDTO;
import com.gbotelho.dscommerce.entities.Product;
import com.gbotelho.dscommerce.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	@Transactional(readOnly = true)
	public ProductDTO findById(Long id) {
		Optional<Product> result = repository.findById(id);
		Product product = result.get();
		return new ProductDTO(product);
	}

}
