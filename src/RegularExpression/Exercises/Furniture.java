package RegularExpression.Exercises;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile(">>(?<name>\\w+)<<(?<price>[\\d.]+)!(?<quantity>\\d+)");
        List<String> purchases = new LinkedList<>();
        double totalSum = 0;
        while (!text.equals("Purchase")) {
            Matcher matcher = pattern.matcher(text);

            while ((matcher.find())) {
                String name = matcher.group("name");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                purchases.add(name);
                totalSum += quantity * price;
            }
            text = scanner.nextLine();
        }
        System.out.println("Bought furniture: ");
        purchases.forEach(el -> System.out.println(el));
        System.out.printf("Total money spend: %.2f", totalSum);

    }
}
