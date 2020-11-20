package com.stark.springbootretry.controller;

import com.stark.springbootretry.exception.ApiException;
import com.stark.springbootretry.service.SpringbootRetryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringbootRetryRestController {

    @Autowired
    private SpringbootRetryService springbootRetryService;

    @GetMapping("/hello")
    public String getMessage() throws ApiException {
        return springbootRetryService.getMessage();
    }
}
