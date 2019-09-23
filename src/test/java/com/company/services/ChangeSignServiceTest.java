package com.company.services;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ChangeSignServiceTest {

    private final static Long DECIMAL_NUMBER = 56413456L;

    private ChangeSignService changeSignService = new ChangeSignService();

    @Test
    public void shouldReturnNegativeNumer() {
        assertTrue(changeSignService.changeSign(DECIMAL_NUMBER) < 0);
    }

    @Test
    public void shouldReturPositiveNumer() {
        long negative = DECIMAL_NUMBER * -1;
        assertTrue(changeSignService.changeSign(negative) > 0);
    }
}
