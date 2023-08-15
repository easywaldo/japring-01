package com.japstudy.japstudy.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Objects;

@SpringBootTest
class ProductServiceTest {
    @Autowired
    public ProductService productService;

    @Test
    public void 상품등록테스트() {
        // arrange
        AddProductCommand addProductCommand = new AddProductCommand("prod-001", "스프링프레임워크", 70000);

        // act
        String savedProductId = productService.addProduct(addProductCommand);

        // assert
        assert Objects.equals(savedProductId, addProductCommand.productId());
    }

}