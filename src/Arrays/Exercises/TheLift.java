package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waitingPeople = Integer.parseInt(scanner.nextLine());
        int[] lift = Arrays
                .stream(scanner.nextLine().trim().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        boolean peopleExist = true;
        for (int i = 0; i < lift.length; i++) {
            while ((lift[i]) < 4) {
                waitingPeople -= 1;
                lift[i] += 1;
                if (waitingPeople == 0) {
                    peopleExist = false;
                    break;
                }
            }
            if (waitingPeople == 0) {
                break;
            }
        }
        boolean spotsExist = false;
        for (int i = 0; i < lift.length; i++) {
            if (lift[i] < 4) {
                spotsExist = true;
            }
        }
        if (!spotsExist && waitingPeople == 0) {
            Arrays.stream(lift).forEach(e -> System.out.print(e + " "));
        } else if (spotsExist) {
            System.out.println("The lift has empty spots!");
            Arrays.stream(lift).forEach(e -> System.out.print(e + " "));
        } else {
            System.out.printf("There isn't enough space! %d people in a queue!\n", waitingPeople);
            Arrays.stream(lift).forEach(e -> System.out.print(e + " "));
        }
















        //     lift[i] = 4;
        //}
        // if (waitingPeople < 4) {
        //   lift[i] = waitingPeople;
        // }
        //waitingPeople -= 4;

        //if (lift[i] < 4 && waitingPeople == 0) {
        //   System.out.println("The lift has empty spots!");
        //   System.out.print(lift[i] + " ");
        //} else {
        //   System.out.print(lift[i] + " ");
    }
}
