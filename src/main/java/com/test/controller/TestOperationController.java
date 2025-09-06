package com.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.service.TestOperationService;

@RestController
@RequestMapping("/test")
public class TestOperationController {

    private final TestOperationService testOperationService;

    public TestOperationController(TestOperationService testOperationService) {
        this.testOperationService = testOperationService;
    }


    @GetMapping
    public ResponseEntity<Integer> suma(@RequestParam Long numberOne, @RequestParam Long numberTwo) {
        return ResponseEntity.ok(testOperationService.suma(numberOne, numberTwo));
    }

    
}
