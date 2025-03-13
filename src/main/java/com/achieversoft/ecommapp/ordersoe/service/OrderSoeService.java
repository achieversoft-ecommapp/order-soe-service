package com.achieversoft.ecommapp.ordersoe.service;

import com.achieversoft.ecommapp.ordersoe.client.CustomerDataClient;
import com.achieversoft.ecommapp.ordersoe.client.ProductDataClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * The type Product service.
 */
@Service
public class OrderSoeService {

    @Autowired
    private CustomerDataClient customerData;

    @Autowired
    private ProductDataClient productData;


    public Object getProductsForCustomer(@PathVariable String id){
        return customerData.getProductsForCustomer(id);
    }

    public Object getCustomersForProduct(@PathVariable String id){
        return customerData.getCustomersForProduct(id);
    }



}
