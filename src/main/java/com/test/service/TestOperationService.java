package com.test.service;

import org.springframework.stereotype.Service;

@Service
public class TestOperationService {

    public Integer suma(Long numberOne, Long numberTwo) {
        return numberOne.intValue() + numberTwo.intValue();
    }

    public Integer resta(Long numberOne, Long numberTwo) {
        return numberOne.intValue() - numberTwo.intValue() ;
    }
}
