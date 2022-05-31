package com.spring.restapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/common")
public class CommonController {

    @GetMapping("/welcome")
    public ResponseEntity<?> getExample() {
        return ResponseEntity.ok("Welcome to spring boot rest api application");
    }
}