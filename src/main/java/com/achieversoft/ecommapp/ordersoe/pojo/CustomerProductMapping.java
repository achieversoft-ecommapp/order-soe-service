package com.achieversoft.ecommapp.ordersoe.pojo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type CustomerProductMapping.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerProductMapping {
    private String customerId;
    private String productId;
}
