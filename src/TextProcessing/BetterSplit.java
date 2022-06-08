package TextProcessing;

import java.util.ArrayList;
import java.util.List;

public class BetterSplit {
    public static void main(String[] args) {
        String text = "the quick brown fox jumps over the lazy dog";

        List<String> list = new ArrayList<>();

        char separator = ' ';
        java.lang.StringBuilder current = new java.lang.StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != separator) {
                current.append(text.charAt(i));
            } else {
                list.add(current.toString());           //to.String за да вземем създаденият стринг и да го добавим в Листа.
                current.setLength(0);                   // setLength(0) за да зачистим взетият текст и да започнем от начало без
                                                        // думата до separator.
            }
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
