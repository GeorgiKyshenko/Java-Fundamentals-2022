package DataTypeExercises;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumLiters = 0;
        for (int i = 0; i < n; i++) {
            int addedLiters = Integer.parseInt(scanner.nextLine());
            if (sumLiters + addedLiters <= 255) {
                sumLiters += addedLiters;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(sumLiters);
    }
}
