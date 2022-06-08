package Demos;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        StringBuilder test = new StringBuilder();

        char removeWord = 'z';

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == removeWord) {
                text = text.replace(removeWord, 'l');
                test.append(text);
            }
        }
        test.insert(2, 'o');

        for (int i = 0; i < test.length(); i++) {
            if (i <= 2) {
                test.append(test.charAt(i));
            } else {
                test.replace(0,1,"");
            }

        }
        System.out.println(test);

    }
}
