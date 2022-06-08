package TextProcessing;

import java.util.ArrayList;
import java.util.List;

public class SplitMethodGeneralCode {
    public static void main(String[] args) {
        String text = "the quick brown fox jumps over the lazy dog";

        List<String> list = new ArrayList<>();

        char separator = ' ';
        String current = "";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != separator) {
                current += text.charAt(i);
            } else {
                list.add(current);
                current = "";
            }
        }
        for (String s : list) {
            System.out.println(s);
        }

    }
}
