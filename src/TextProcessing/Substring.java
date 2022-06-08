package TextProcessing;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = "the quick brown fox jumps over the lazy dog";

        char split = 'q';
        int splitIndex = -1; // или  int splitIndex = text.indexOf(split); и махаме for цикала !

        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == split) {
                splitIndex = i;
                break;                          // ако махнем brake и има един символ който се повтаря, ще сплитне по последният.
            }
        }
        if (splitIndex != -1) {
            String splitBefore = text.substring(0,splitIndex);
            String splitAfter = text.substring(splitIndex);
            System.out.println(splitBefore);
            System.out.println(splitAfter);
        } else {
            System.out.println(text);
        }

    }
}
