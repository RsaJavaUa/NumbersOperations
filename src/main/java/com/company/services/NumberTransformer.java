package com.company.services;

import lombok.Setter;

@Setter
public class NumberTransformer {

    private ConsoleInputService inputService = new ConsoleInputService();

    public long binaryToIntConsole() {
        System.out.println("Enter number in binary format");
        return binaryToInt(inputService.stringInputFromConsole());
    }

    public long binaryToInt(String str) {
        int sum = 0, a;
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(str.length() - 1 - i);
            if (c == '1' || c == '0') {
                if (c == '1')
                    a = 1;
                else a = 0;
            } else {
                throw new IllegalArgumentException("Wrong input " + str);
            }
            sum += (a * Math.pow(2, i));
        }
        return sum;
    }
}
