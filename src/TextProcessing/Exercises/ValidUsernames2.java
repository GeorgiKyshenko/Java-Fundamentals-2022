package TextProcessing.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ValidUsernames2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arrays.stream(scanner.nextLine().split(", "))
                .filter(username -> username.length() >= 3 && username.length() <= 16)
                .filter(username -> username.matches("[a-zA-Z_\\-\\d]+"))
                .forEach(u -> System.out.println(u));
    }
}
