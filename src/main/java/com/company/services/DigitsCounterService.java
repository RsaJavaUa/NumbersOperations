package com.company.services;

public class DigitsCounterService {

    public int countDigits(long number) {
        if (number < 0) {
            number *= -1;
            return countDigits(number) + 1;
        }
        int count = 0;
        while (number > 0) {
            count++;
            number = number >> 1;
        }
        return count;
    }
}
