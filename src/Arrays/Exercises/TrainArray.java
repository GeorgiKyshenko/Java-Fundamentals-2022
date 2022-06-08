package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class TrainArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagons = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int[] train = new int[wagons];
        for (int i = 0; i < train.length; i++) {
            train[i] = Integer.parseInt(scanner.nextLine());
            sum += train[i];
            System.out.printf("%d \n", train[i]);
        }
        //Arrays.stream(train).forEach(wagon-> System.out.print(wagon + " "));
        System.out.println();
        System.out.println(sum);
    }
}

