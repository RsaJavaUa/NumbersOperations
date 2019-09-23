package com.company.services;

public class ChangeSignService {

    public static long changeSign(long number) {
        return ~number + 1;
    }
}
