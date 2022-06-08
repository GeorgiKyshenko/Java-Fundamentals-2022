package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringNumbersToInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = lineOfStringsToInt(scanner);

        // или

        // for (int i = 0; i < numbersAsString.length; i++) {              //парсване на стринг числа в инт числа към Лист.
        //  numbers.add(Integer.parseInt(numbersAsString[i]));
        // }

        for (int number : numbers) {
            System.out.println(number);
        }
    }

    private static List<Integer> lineOfStringsToInt(Scanner scanner) {
        List<Integer> numbers = new ArrayList<>();
        String lineOfNumbers = scanner.nextLine();
        String[] numbersAsString = lineOfNumbers.split(" ");
        for (String s : numbersAsString) {
            numbers.add(Integer.parseInt(s));
        }
        return numbers;
    }
}


