package FinalExam;

import java.util.*;

public class MealParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        Map<String, List<String>> guests = new LinkedHashMap<>();
        int unliked = 0;

        while (!command.equals("Stop")) {
            String[] split = command.split("-");
            String opinion = split[0];

            switch (opinion) {
                case "Like":
                    guests.putIfAbsent(split[1], new ArrayList<>());
                    if (!guests.get(split[1]).contains(split[2])) {
                        guests.get(split[1]).add(split[2]);
                    }
                    break;
                case "Dislike":
                    String name = split[1];
                    String meal = split[2];
                    if (!guests.containsKey(split[1])) {
                        System.out.printf("%s is not at the party.%n", name);
                        break;
                    }
                    if (!guests.get(name).contains(split[2])) {
                        System.out.printf("%s doesn't have the %s in his/her collection.%n", name, meal);
                    } else {
                        guests.get(name).remove(meal);
                        unliked++;
                        System.out.printf("%s doesn't like the %s.%n", name, meal);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : guests.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            System.out.println(String.join(",", entry.getValue()));
        }
        System.out.printf("Unliked meals: %d", unliked);
    }
}
