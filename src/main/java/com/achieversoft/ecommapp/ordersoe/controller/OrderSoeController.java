package com.achieversoft.ecommapp.ordersoe.controller;

import com.achieversoft.ecommapp.commonapplibrary.response.MonoResponseHelper;
import com.achieversoft.ecommapp.ordersoe.common.exception.OrderSoeException;
import com.achieversoft.ecommapp.ordersoe.service.OrderSoeService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static com.achieversoft.ecommapp.commonapplibrary.constants.GlobalConstants.HTTP_STATUS_CODE_200;
import static com.achieversoft.ecommapp.commonapplibrary.constants.GlobalConstants.SUCCESS_STATUS_MESSAGE;
import static com.achieversoft.ecommapp.commonapplibrary.constants.GlobalConstants.SUCCESS_STAUS;
import static com.achieversoft.ecommapp.ordersoe.common.constants.OrderSoeConstants.GET_CUST_FOR_PROD;
import static com.achieversoft.ecommapp.ordersoe.common.constants.OrderSoeConstants.GET_PROD_FOR_CUST;
import static com.achieversoft.ecommapp.ordersoe.common.constants.OrderSoeConstants.SERVICE_NAME;


/**
 * The type OrderSoeController
 */
@RestController
public class OrderSoeController {

    @Autowired
    private OrderSoeService service;

   /**
    * getProductsForCustomer
    *
    * @param id the id
    * @return the response entity
    */
   @GetMapping("/details/productsbycustomerid/{id}")
   @Operation(description = "Product id list by customer ids")
   public Object getProductsForCustomer(@PathVariable String id){
       try{
           return MonoResponseHelper.buildAPIResponse(Boolean.TRUE,HTTP_STATUS_CODE_200,SUCCESS_STATUS_MESSAGE,
                   service.getProductsForCustomer(id),GET_PROD_FOR_CUST,SUCCESS_STAUS,SERVICE_NAME);
       }catch (Exception e){
           throw new OrderSoeException(e.getMessage(),GET_PROD_FOR_CUST);
       }
   }

    /**
     * getCustomersForProduct
     *
     * @param id the id
     * @return the response entity
     */
    @GetMapping("/details/customersbyproductid/{id}")
    @Operation(description = "Customer id lis by product ids")
    public Object getCustomersForProduct(@PathVariable String id){
        try{
            return MonoResponseHelper.buildAPIResponse(Boolean.TRUE,HTTP_STATUS_CODE_200,SUCCESS_STATUS_MESSAGE,
                    service.getCustomersForProduct(id),GET_CUST_FOR_PROD,SUCCESS_STAUS,SERVICE_NAME);
        }catch (Exception e){
            throw new OrderSoeException(e.getMessage(),GET_CUST_FOR_PROD);
        }
    }




}
