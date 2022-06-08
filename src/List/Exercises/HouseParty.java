package List.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commands = Integer.parseInt(scanner.nextLine());
        List<String> guests = new ArrayList<>();
        for (int i = 0; i < commands; i++) {
            String inputs = scanner.nextLine();
            String[] names = inputs.split(" ");
            String name = names[0];
            if (!inputs.contains("not")) {                    // или if(name.length == 3)
                if (guests.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    guests.add(name);
                }
            } else if (inputs.contains("not")) {
                if (guests.contains(name)) {
                    guests.remove(name);
                } else {
                    System.out.printf( "%s is not in the list!%n", name);
                }
            }
        }
        guests.forEach(el-> System.out.println(el + " "));
    }
}
