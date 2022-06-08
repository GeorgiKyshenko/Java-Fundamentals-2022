package DataTypeExercises;

import java.util.Scanner;

public class PrintPartOfTheAscii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        for (int i = start; i <= end; i++) {
           // char symbol = (char) i;
           // System.out.print(symbol + " ");
           // Или
            System.out.printf("%c ",i);
        }
    }
}
