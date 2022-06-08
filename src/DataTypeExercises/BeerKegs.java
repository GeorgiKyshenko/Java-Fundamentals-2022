package DataTypeExercises;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kegs = Integer.parseInt(scanner.nextLine());
        String biggestModel = "";
        double biggestKeg = Double.MIN_VALUE;
        for (int i = 0; i < kegs; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double calculation = Math.PI * Math.pow(radius, 2) * height;
            if (calculation > biggestKeg) {
                biggestKeg = calculation;
                biggestModel = model;
            }
        }
        System.out.println(biggestModel);
    }
}
