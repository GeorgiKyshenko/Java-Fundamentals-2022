package TextProcessing.Exercises;

import java.util.Scanner;

public class ReplaceRepeatingCharsV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        char[] words = scanner.nextLine().toCharArray();
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i] != words[i + 1]) {
                sb.append(words[i]);
            }
        }
        sb.append(words[words.length- 1]);
        System.out.println(sb);
    }
}
