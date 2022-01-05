package com.stark.springbootretry.service;

import com.stark.springbootretry.exception.ApiException;
import org.springframework.stereotype.Service;

@Service
public class SpringbootRetryServiceImpl implements SpringbootRetryService {
    @Override
    public String getMessage() throws ApiException {
        System.out.println("Inside getMessage");
        //If you are wondering what logic exists here. ! You can have external API calls or service calls here. 
        //In that way, max retry failures will ensure default method is executed for backup.
        throw new ApiException("Hello !!!");
    }

    @Override
    public String getDefaultMessage() {
        System.out.println("Inside getDefaultMessage");
        return "Hello from Default World !!";
    }
}
