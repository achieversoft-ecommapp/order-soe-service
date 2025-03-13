package com.achieversoft.ecommapp.ordersoe.client;


import com.achieversoft.ecommapp.ordersoe.pojo.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@FeignClient(name = "customerData", url = "http://localhost:8082/ecommapp/customerdata")
public interface CustomerDataClient {

    @GetMapping("/details/{id}")
    public Object getCustomerById(@PathVariable String id);

    @GetMapping("/details/all")
    public Object getCustomers();

    @PutMapping("/details/updt")
    public Object saveOrUpdateCustomer(@RequestBody List<Customer> list);

    @PostMapping("/details/dlt/{id}")
    public Object deleteCustomer(@PathVariable String id);

    @PostMapping("/details/dlt/all")
    public Object deleteAllCustomer();

    @GetMapping("/details/productsforcustomer/{id}")
    public Object getProductsForCustomer(@PathVariable String id);

    @GetMapping("/details/customersforproduct/{id}")
    public Object getCustomersForProduct(@PathVariable String id);
}
