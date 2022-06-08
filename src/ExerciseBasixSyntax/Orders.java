package ExerciseBasixSyntax;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int orders = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0.0;
        for (int i = 0; i < orders; i++) {
            double price = Double.parseDouble(scanner.nextLine());
            String days = scanner.nextLine();
            int capsules = Integer.parseInt(scanner.nextLine());
            int daysInt = Integer.parseInt(days);
            double overallPrice = (daysInt * capsules) * price;
            totalPrice += overallPrice;
            System.out.printf("%nThe price for the coffee is: $%.2f", overallPrice);
        }
        System.out.println();
        System.out.printf("Total: $%.2f", totalPrice);
    }
}
