package DataTypeExercises.MoreExercises;

import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        long sum = 0;
        for (int i = 0; i < n; i++) {
            long left = scanner.nextLong();
            long right = scanner.nextLong();
            sum = 0;
            if (left < right) {
                while (right != 0) {
                    sum += right % 10;
                    right /= 10;

                }
            } else {
                while (left != 0) {
                    sum += left % 10;
                    left /= 10;

                }
            }
            System.out.println(Math.abs(sum));
        }
    }
}
