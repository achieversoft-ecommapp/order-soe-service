package com.achieversoft.ecommapp.ordersoe.client;


import com.achieversoft.ecommapp.ordersoe.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * The interface Product repository.
 */
@Repository
@FeignClient(name = "productData", url = "http://localhost:8083/ecommapp/productdata")
public interface ProductDataClient  {

    @GetMapping("/details/{id}")
    public Object getProductById(@PathVariable String id);

    @GetMapping("/details/all")
    public Object getProducts();

    @PutMapping("/details/updt")
    public Object saveOrUpdateProduct(@RequestBody List<Product> list);

    @PostMapping("/details/dlt/{id}")
    public Object deleteProduct(@PathVariable String id);

    @PostMapping("/details/dlt/all")
    public Object deleteAllProduct();
}
