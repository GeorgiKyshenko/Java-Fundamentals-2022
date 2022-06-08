package TextProcessing.Exercises;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(", ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < line.length; i++) {
            if (line[i].length() >= 3 && line[i].length() <= 16) {
                for (int j = 0; j < line[i].length(); j++) {
                    char symbol = line[i].charAt(j);
                    if (Character.isLetterOrDigit(symbol) || symbol == 45 || symbol == 95) {  // символите се взимат от ASCII таблица.
                        sb.append(symbol);

                    } else {
                        break;
                    }
                }
            }
            if (line[i].length() == sb.length()) {
                System.out.println(sb);
            }
            sb.setLength(0);
        }
    }
}