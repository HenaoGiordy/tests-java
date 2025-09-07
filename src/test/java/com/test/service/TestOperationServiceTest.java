package com.test.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestOperationServiceTest {

    @InjectMocks
    private TestOperationService testOperationService;

    @Test
    public void testSuma() {
        Long numberOne = 5L;
        Long numberTwo = 10L;
        Integer result = testOperationService.suma(numberOne, numberTwo);
        assertEquals(15, result);
        
    }

    @Test
    public void testResta() {
        Long numberOne = 10L;
        Long numberTwo = 5L;
        Integer result = testOperationService.resta(numberOne, numberTwo);
        assertEquals(5, result);
    }

    @Test
    public void testMultiply() {
        Long numberOne = 5L;
        Long numberTwo = 10L;
        Integer result = testOperationService.multiply(numberOne, numberTwo);
        assertEquals(50, result);
    }

    @Test
    public void testDivide() {
        Long numberOne = 10L;
        Long numberTwo = 2L;
        Integer result = testOperationService.divide(numberOne, numberTwo);
        assertEquals(5, result);
    }

    @Test
    public void testDivideByZero() {
        Long numberOne = 10L;
        Long numberTwo = 0L;
        try {
            testOperationService.divide(numberOne, numberTwo);
        } catch (IllegalArgumentException e) {
            assertEquals("Division by zero is not allowed.", e.getMessage());
        }
    }

}
