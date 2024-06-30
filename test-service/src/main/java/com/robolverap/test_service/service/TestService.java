package com.robolverap.test_service.service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Value("${test.greeting}")
    private String greeting;

    public String processRequest(String input) {
        return greeting + " Processed: " + input.toUpperCase();
    }
}