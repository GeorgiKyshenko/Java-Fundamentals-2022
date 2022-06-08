package Methods;

import java.util.Scanner;

public class PrintSign {
    static void NumberSign(int n) {
        if (n >= 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberSign(scanner.nextInt());
    }
}
