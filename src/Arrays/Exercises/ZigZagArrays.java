package Arrays.Exercises;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] firstArr = new String[n];
        String[] secondArr = new String[n];
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ");
            if (i % 2 == 0) {
                firstArr[i] = line[0];
                secondArr[i] = line[1];
            } else {
                firstArr[i] = line[1];
                secondArr[i] = line[0];
            }
        }
        for (int i = 0; i < firstArr.length; i++) {
            System.out.print(firstArr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < secondArr.length; i++) {
            System.out.print(secondArr[i] + " ");
        }
    }
}
