package ExamPreperation.LiveExam;

import java.util.Scanner;

public class CookingMasterclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double packageFlour = Double.parseDouble(scanner.nextLine());
        double singleEgg = Double.parseDouble(scanner.nextLine());
        double singleApron = Double.parseDouble(scanner.nextLine());
        double priceEggs = (students * 10) * singleEgg;
        double priceAprons = Math.ceil(students * 1.20) * singleApron;
        double priceFlour = 0;
        if (students % 5 == 0) {
            students = students - students / 5;
            priceFlour = students * packageFlour;
        } else {
            priceFlour = students * packageFlour;
        }
        double totalPrice = priceAprons + priceEggs + priceFlour;
        if (totalPrice <= budget) {
            System.out.printf("Items purchased for %.2f$.",totalPrice);
        } else {
            System.out.printf("%.2f$ more needed.", totalPrice - budget);
        }

    }
}
