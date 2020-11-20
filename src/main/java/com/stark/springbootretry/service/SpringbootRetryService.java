package com.stark.springbootretry.service;

import com.stark.springbootretry.exception.ApiException;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;

public interface SpringbootRetryService {

    @Retryable(value = { ApiException.class }, maxAttempts = 3, backoff = @Backoff(delay = 1000))
    String getMessage() throws ApiException;

    @Recover
    String getDefaultMessage();

}
