package com.devsuperior.dscommerce.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dscommerce.dto.ProductDTO;
import com.devsuperior.dscommerce.entities.Product;
import com.devsuperior.dscommerce.repositories.ProductRepositoriy;

@Service
public class ProductService {

    @Autowired
    private ProductRepositoriy repository;
    
    @Transactional(readOnly = true)
    public ProductDTO findById(Long id){
        Product product = repository.findById(id).get();
        return new ProductDTO(product);
    }
}
