package Methods;

import java.util.Scanner;

public class ScannerInMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = readLines(scanner, ",");
        for (String word : words) {
            System.out.println(word);
        }
    }

    private static String[] readLines(Scanner scanner, String splitByRegex) {
        String s = scanner.nextLine();
        return s.split(splitByRegex);
    }

}
