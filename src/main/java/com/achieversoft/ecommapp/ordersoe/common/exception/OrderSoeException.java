package com.achieversoft.ecommapp.ordersoe.common.exception;

import lombok.Data;

/**
 * The type Product data exception.
 */
@Data
public class OrderSoeException extends RuntimeException{

    private String taskName;
    /**
     * Instantiates a new Product data exception.
     *
     * @param message the message
     */
    public OrderSoeException(String message){
        super(message);
    }

    public OrderSoeException(String message, String taskName){
        super(message);
        this.taskName=taskName;
    }
}
