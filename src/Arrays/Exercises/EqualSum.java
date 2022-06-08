package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().trim().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sumLeft = 0;

        for (int i = 0; i < numbers.length; i++) {
            int sumRight = 0;
            for (int j = i + 1; j < numbers.length; j++) {
                sumRight += numbers[j];
            }
            if (sumLeft == sumRight) {
                System.out.println(i);
                return;
            }
            sumLeft += numbers[i];
        }

        System.out.println("no");
    }
}


