package Methods;

import java.util.Scanner;

public class MethodExample {
    private static int[] parseIntArray(String lineOfNumbers) {
        String[] numberString = lineOfNumbers.split(" ");
        int[] elements = new int[numberString.length];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = Integer.parseInt(numberString[i]);
        }
        return elements;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = parseIntArray(scanner.nextLine());
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
