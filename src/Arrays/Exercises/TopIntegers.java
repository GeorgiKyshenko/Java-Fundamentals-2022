package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        for (int i = 0; i < input.length; i++) {
            boolean isTop = true;
            for (int j = i + 1; j < input.length; j++)
                if (input[i] <= input[j]) {
                    isTop = false;
                    break;
                }
            if (isTop) {
                System.out.print(input[i] + " ");
            }
        }
    }
}
