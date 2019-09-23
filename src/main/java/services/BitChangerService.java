package services;

import java.util.Arrays;

public class BitChangerService {

    private DigitsCounterService digitsCounterService = new DigitsCounterService();
    private NumberTransformer numberTransformer = new NumberTransformer();

    public  long changeBitOnPositiontInDecimal(int number, int position) {
        int[] numbersAsArray = toBinar(number);
        numbersAsArray[position] = numbersAsArray[position] == 0 ? 1 : 0;
        return numberTransformer.binaryToInt(fromArrayToString(numbersAsArray));
    }

    private int[] toBinar(int a) {
        int[] result = new int[digitsCounterService.countDigits(a)];
        int b, index = result.length - 1;
        while (a != 0) {
            b = a % 2;
            result[index] = b;
            index--;
            a = a / 2;
        }
        return result;
    }

    private String fromArrayToString(int[] array) {
        StringBuilder result = new StringBuilder();
        Arrays.stream(array).forEach(result::append);
        return result.toString();
    }
}
