package utils;

import java.util.Arrays;
import java.util.Scanner;

public class NumberUtil {

    public static long changeSign(long number) {
        return ~number + 1;
    }

    public static int countDigits(long number) {
        int count = 0;
        while (number > 0) {
            count++;
            number = number >> 1;
        }
        return count;
    }

    private static long binaryToInt(String str) {
        int sum = 0, a;
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(str.length() - 1 - i);
            if (c == '1' || c == '0') {
                if (c == '1')
                    a = 1;
                else a = 0;
            } else {
                System.out.println("Wrong input");
                break;
            }
            sum += (a * Math.pow(2, i));
        }
        return sum;
    }

    private static int[] toBinar(int a) {
        int[] result = new int[countDigits(a)];
        int b, index = result.length - 1;
        while (a != 0) {
            b = a % 2;
            result[index] = b;
            index--;
            a = a / 2;
        }
        return result;
    }

    public static long changeBitOnPositionInBinar(int number, int position) {
        int[] numbersAsArray = toBinar(number);
        numbersAsArray[position] = numbersAsArray[position] == 0 ? 1 : 0;
        return fromArrayToInt(numbersAsArray);
    }

    public static long changeBitOnPositiontInDecimal(int number, int position) {
        int[] numbersAsArray = toBinar(number);
        numbersAsArray[position] = numbersAsArray[position] == 0 ? 1 : 0;
        return binaryToInt(fromArrayToString(numbersAsArray));
    }


    private static long fromArrayToInt(int[] array) {
        StringBuilder result = new StringBuilder();
        Arrays.stream(array).forEach(result::append);
        return Integer.parseInt(result.toString());
    }

    private static String fromArrayToString(int[] array) {
        StringBuilder result = new StringBuilder();
        Arrays.stream(array).forEach(result::append);
        return result.toString();
    }

    public static long BinaryToIntConsole() {
        System.out.println("Enter number in binary format");
        return NumberUtil.binaryToInt(new Scanner(System.in).nextLine());
    }
}
