package com.japstudy.japstudy.product;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

@DataJpaTest
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @DisplayName("상품을 저장하고 페이징 단위로 조회하는 테스트")
    @Test
    void 상품조회_페이징_테스트() {
        // arrange
        productRepository.save(new Product("product-001", "Kotlin", 50000));
        productRepository.save(new Product("product-002", "Java18", 50000));
        productRepository.save(new Product("product-003", "SpringFramework", 35000));
        productRepository.save(new Product("product-004", "WebFlux", 30000));

        // act
        PageRequest pageRequest = PageRequest.of(0, 10);
        Page<Product> productList = productRepository.findByPrice(50000, pageRequest);

        // assert
        assert productList.getTotalElements() == 2;

    }
}
