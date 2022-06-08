package TextProcessing;

import java.util.ArrayList;
import java.util.List;

public class FindDigitsInText {
    public static void main(String[] args) {
        String text = "t23he qui143ck br32own fox jum432ps ov4er th2e laz32y do3g";

        List<String> list = new ArrayList<>();

        char separator = ' ';
        java.lang.StringBuilder current = new java.lang.StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i))) {
                current.append(text.charAt(i));
//            } else {
//                list.add(current.toString());           //to.String за да вземем създаденият стринг и да го добавим в Листа.
//                current.setLength(0);                   // setLength(0) за да зачистим взетият текст и да започнем от начало без
//                                                        // думата до separator.
//            }
//        }
//        for (String s : list) {
//            System.out.print(s + " ");
//        }
            }


        }
        System.out.println(current);
    }
}
