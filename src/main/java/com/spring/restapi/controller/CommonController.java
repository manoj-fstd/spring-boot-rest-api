package com.spring.restapi.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    @GetMapping("welcome")
    public ResponseEntity<?> getExample() {
        return ResponseEntity.ok("Welcome to spring boot example application");
    }
}