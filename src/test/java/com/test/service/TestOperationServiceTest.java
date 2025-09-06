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

}
