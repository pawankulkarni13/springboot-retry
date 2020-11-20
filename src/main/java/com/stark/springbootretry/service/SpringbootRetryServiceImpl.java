package com.stark.springbootretry.service;

import com.stark.springbootretry.exception.ApiException;
import org.springframework.stereotype.Service;

@Service
public class SpringbootRetryServiceImpl implements SpringbootRetryService {
    @Override
    public String getMessage() throws ApiException {
        System.out.println("Inside getMessage");
        throw new ApiException("Hello !!!");
    }

    @Override
    public String getDefaultMessage() {
        System.out.println("Inside getDefaultMessage");
        return "Hello from Default World !!";
    }
}
