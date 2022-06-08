package ExerciseBasixSyntax;

import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char one = scanner.nextLine().charAt(0);
        char two = scanner.nextLine().charAt(0);
        char three = scanner.nextLine().charAt(0);
        int number = 0;
        number *= 10;
        number += one - '0';
        number *= 10;
        number += two - '0';
        number *= 10;
        number += three - '0';
        System.out.println(number);

    }
}
