package List;

import java.util.ArrayList;
import java.util.List;

public class StringList {
    public static void main(String[] args) {
        List<String> wordsList = new ArrayList<String>();
        wordsList.add("sweet");    //0 (позиция)
        wordsList.add("salt");     //1
        wordsList.add("apple");    //2
        wordsList.add("orange");   //3

        System.out.println(wordsList.get(0));   // отпечатване на думата на 0 индекс.

        wordsList.set(1, "not so salt");        // промяна на думата на 1ви индекс.

        wordsList.remove(2);              // премахване на 2ри индекс (позиция)

        for (int i = 0; i < wordsList.size(); i++) {           // дължината на Листа е wordsList.size()
            System.out.println(wordsList.get(i));              // отпечатване на всички думи в Листа.
        }
    }
}
