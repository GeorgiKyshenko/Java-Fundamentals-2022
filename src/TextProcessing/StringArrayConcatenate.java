package TextProcessing;

import java.util.Scanner;

public class StringArrayConcatenate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String[] words = scanner.nextLine().split(" ");

       String[] newWords = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            newWords[i] = words[i];
        }
        String repeated = String.join("", newWords);
        System.out.println(repeated);
    }
}
