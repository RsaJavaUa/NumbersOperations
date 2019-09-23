package com.company.services;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class BitChangerServiceTest {

    private static final int DECIMAL_NUMBER = 10;
    private static final int RESULT = 8;
    private static final int POSITION = 2;
    private static final int WRONG_POSITION = 5;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private BitChangerService changerService = new BitChangerService();

    @Test
    public void shouldReturnEight() {
        assertEquals(RESULT, changerService.changeBitOnPositiontInDecimal(DECIMAL_NUMBER, POSITION));
    }

    @Test
    public void sholdThrowException() {
        expectedException.expect(IndexOutOfBoundsException.class);
        expectedException.expectMessage("5");
        changerService.changeBitOnPositiontInDecimal(DECIMAL_NUMBER, WRONG_POSITION);
    }
}
