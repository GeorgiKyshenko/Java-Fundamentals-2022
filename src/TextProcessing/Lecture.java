package TextProcessing;

import java.util.Scanner;

public class Lecture {                               // Задача -> отпечатване на дума колкото пъти и е дължината.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        for (String word : words) {
            char[] repeated = new char[word.length() * word.length()];      // ако искаме да отпечатаме 3 думи конкатенирани,
                                                                            // прото трябва да променим размера на char[] на words.length.
            for (int i = 0; i < repeated.length; i++) {
                repeated[i] = word.charAt(i % word.length());
            }
            System.out.print(repeated);
        }
        /* или може да се изведе метод
        ->>

        private static String repeat(String word, int repetition) {         repetition e word.length
        char[] repeated = new char[word.length() * repetition];
        for (int i = 0; i < repeated.length; i++) {
            repeated[i] = word.charAt(i % word.length());
        }
        return new String(repeated);
    }
         */
    }
}
