package com.stark.springbootretry.exception;

public class ApiException extends Exception {
    public ApiException(String message){
        super(message);
    }
}
