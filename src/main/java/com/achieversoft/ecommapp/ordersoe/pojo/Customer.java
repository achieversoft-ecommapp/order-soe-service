package com.achieversoft.ecommapp.ordersoe.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

/**
 * The type Customer.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
    private String customerId;
    private String customerName;
    private Date customerDob;
    private String customerMobile;
    private String customerEmail;
    private String customerAddr;
}
