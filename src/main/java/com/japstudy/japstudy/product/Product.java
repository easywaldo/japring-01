package com.japstudy.japstudy.product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "product")
@Getter
@NoArgsConstructor
public class Product {
    @Id
    @Column(name = "id")
    public String id;

    @Column(name = "name")
    public String name;

    @Column(name = "price")
    public Integer price;

    public Product(String id, String name, Integer price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


}
