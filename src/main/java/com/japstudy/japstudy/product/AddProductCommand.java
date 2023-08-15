package com.japstudy.japstudy.product;

import lombok.Getter;

public record AddProductCommand(String productId, String productName, Integer productPrice) {
}
