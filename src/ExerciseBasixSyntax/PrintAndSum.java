package ExerciseBasixSyntax;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.next());
        int sum = 0;
        for (int i = number; i <=number2 ; i++) {
            sum += i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.printf("Sum: %d", sum); // или ("%nSum: %d" , sum)
    }
}
