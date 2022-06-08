package ExerciseBasixSyntax;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int persons = Integer.parseInt(scanner.nextLine());
        String groups = scanner.nextLine();
        String day = scanner.nextLine();
        double totalPrice = 0.0;

        switch (day) {
            case "Friday":
                if (groups.equals("Students") && persons >= 30) {
                    totalPrice = (persons * 8.45) * 0.85;
                } else if (groups.equals("Students")) {
                    totalPrice = persons * 8.45;
                }
                if (groups.equals("Business") && persons >= 100) {
                    totalPrice = (persons - 10) * 10.90;
                } else if (groups.equals("Business")) {
                    totalPrice = persons * 10.90;
                }
                if (groups.equals("Regular") && persons >= 10 && persons <= 20) {
                    totalPrice = (persons * 15) * 0.95;
                } else if (groups.equals("Regular")) {
                    totalPrice = persons * 15;
                }
                break;
            case "Saturday":
                if (groups.equals("Students") && persons >= 30) {
                    totalPrice = (persons * 9.80) * 0.85;
                } else if (groups.equals("Students")) {
                    totalPrice = persons * 9.80;
                }
                if (groups.equals("Business") && persons >= 100) {
                    totalPrice = (persons - 10) * 15.60;
                } else if (groups.equals("Business")) {
                    totalPrice = persons * 15.60;
                }
                if (groups.equals("Regular") && persons >= 10 && persons <= 20) {
                    totalPrice = (persons * 20) * 0.95;
                } else if (groups.equals("Regular")) {
                    totalPrice = persons * 20;
                }
                break;
            case "Sunday":
                if (groups.equals("Students") && persons >= 30) {
                    totalPrice = (persons * 10.46) * 0.85;
                } else if (groups.equals("Students")) {
                    totalPrice = persons * 10.46;
                }
                if (groups.equals("Business") && persons >= 100) {
                    totalPrice = (persons - 10) * 16;
                } else if (groups.equals("Business")) {
                    totalPrice = persons * 16;
                }
                if (groups.equals("Regular") && persons >= 10 && persons <= 20) {
                    totalPrice = (persons * 22.50) * 0.95;
                } else if (groups.equals("Regular")) {
                    totalPrice = persons * 22.50;
                }
                break;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
