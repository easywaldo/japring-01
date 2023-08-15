package com.japstudy.japstudy.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional
    public String addProduct(AddProductCommand command) {
        Product product = new Product(command.productId(), command.productName(), command.productPrice());
        Product savedProduct = productRepository.save(product);
        return savedProduct.id;
    }
}
