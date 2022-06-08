package Arrays;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbersAsStrings = input.split("\\s+");
        int evenSum = 0;
        int oddSum = 0;
        for (String s : numbersAsStrings) {
            int number = Integer.parseInt(s);
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }

        }
        System.out.println(evenSum - oddSum);
    }
}
