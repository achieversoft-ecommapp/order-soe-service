package com.achieversoft.ecommapp.ordersoe.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Product.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    private String productId;
    private String name;
    private double price;
}
