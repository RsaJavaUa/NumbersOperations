package com.company.services;

import java.util.Scanner;

public class ConsoleInputService {

    private Scanner scanner = new Scanner(System.in);

    public int intUnputFromConsole() {
        return scanner.nextInt();
    }

    public String stringInputFromConsole() {
        return scanner.nextLine();
    }
}
