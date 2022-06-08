package Arrays.Exercises;

import java.util.Scanner;

public class ComputerStoreProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        double totalPrice = 0.0;
        double priceWithoutTax = 0.0;
        double amountOfTaxes = 0.0;
        while (!data.equals("regular")) {
            if (data.equals("special")) {
                totalPrice *= 0.90;
                break;
            }
            double prices = Double.parseDouble(data);
            if (prices < 0) {
                System.out.println("Invalid price!");
                data = scanner.nextLine();
                continue;
            }
            priceWithoutTax += prices;
            totalPrice = priceWithoutTax * 1.20;
            amountOfTaxes = totalPrice - priceWithoutTax;
            data = scanner.nextLine();
        }
        if (totalPrice == 0) {
            System.out.println("Invalid order!");
        } else {
            System.out.printf("Congratulations you've just bought a new computer!\n" +
                    "Price without taxes: %.2f$\n" +
                    "Taxes: %.2f$\n" +
                    "-----------\n" +
                    "Total price: %.2f$", priceWithoutTax, amountOfTaxes, totalPrice);
        }
    }
}
