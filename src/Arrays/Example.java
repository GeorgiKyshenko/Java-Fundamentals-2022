package Arrays;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersCount = scanner.nextInt();
        int[] numbers = new int[numbersCount];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if ( i != numbers.length - 1) {
                System.out.print(",");
            }
        }
    }
}
