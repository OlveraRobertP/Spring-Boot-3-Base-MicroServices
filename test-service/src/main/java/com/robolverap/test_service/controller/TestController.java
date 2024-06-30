package com.robolverap.test_service.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.robolverap.test_service.service.TestService;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public String test(@RequestParam(defaultValue = "world") String input) {
        return testService.processRequest(input);
    }
}