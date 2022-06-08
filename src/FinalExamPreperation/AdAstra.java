package FinalExamPreperation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int calories = 0;
        List<Food> food = new ArrayList<>();

        Pattern pattern = Pattern.compile("([#|])(?<items>[A-Za-z\\s]+)\\1(?<date>\\d{2}/\\d{2}/\\d{2})\\1(?<calories>\\d+)\\1");
        Matcher match = pattern.matcher(text);
        boolean find = match.find();

        while (find) {
            String item = match.group("items");
            String date = match.group("date");
            int kcal = Integer.parseInt(match.group("calories"));
            calories += kcal;
            Food data = new Food(item, date, kcal);
            food.add(data);
            find = match.find();
        }
        System.out.printf("You have food to last you for: %d days!%n", calories / 2000);
        food.forEach(System.out::println);


    }

    static class Food {
        String name;
        String date;
        int calories;

        public Food(String name, String date, int calories) {
            this.name = name;
            this.date = date;
            this.calories = calories;
        }

        public String getName() {
            return name;
        }

        public String getDate() {
            return date;
        }

        public int getCalories() {
            return calories;
        }

        @Override
        public String toString() {
            return String.format("Item: %s, Best before: %s, Nutrition: %d", name, date, calories);
        }
    }
}
