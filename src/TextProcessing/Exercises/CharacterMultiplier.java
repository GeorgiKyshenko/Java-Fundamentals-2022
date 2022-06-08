package TextProcessing.Exercises;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split("\\s+");
        int totalSum = 0;

        char[] firstWord= line[0].toCharArray();
        char[] secondWord = line[1].toCharArray();

        int minLength = Math.min(firstWord.length, secondWord.length);
        int maxLength = Math.max(firstWord.length, secondWord.length);

        for (int i = 0; i < maxLength; i++) {
            if (i < minLength) {
                totalSum += firstWord[i] * secondWord[i];
            } else if (firstWord.length > secondWord.length) {
                totalSum += firstWord[i];
            } else {
                totalSum += secondWord[i];
            }
        }
        System.out.println(totalSum);
    }
}
