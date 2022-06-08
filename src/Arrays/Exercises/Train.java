package Arrays.Exercises;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagons = Integer.parseInt(scanner.nextLine());
        int peopleSum = 0;
        for (int i = 0; i < wagons; i++) {
            int persons = Integer.parseInt(scanner.nextLine());
            peopleSum += persons;
            System.out.printf("%d ", persons);
        }
        System.out.println();
        System.out.println(peopleSum);

    }
}
