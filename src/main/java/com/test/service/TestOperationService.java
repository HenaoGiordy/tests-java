package com.test.service;

import org.springframework.stereotype.Service;

@Service
public class TestOperationService {

    public Integer suma(Long numberOne, Long numberTwo) {
        return numberOne.intValue() + numberTwo.intValue();
    }

    public Integer resta(Long numberOne, Long numberTwo) {
        return numberOne.intValue() - numberTwo.intValue();
    }

    public Integer multiply(Long numberOne, Long numberTwo) {
        return numberOne.intValue() * numberTwo.intValue();
    }

    public Integer divide(Long numberOne, Long numberTwo) {
        if (numberTwo == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return numberOne.intValue() / numberTwo.intValue();
    }
}
