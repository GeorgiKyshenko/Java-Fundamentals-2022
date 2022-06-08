package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removingElements {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("abc", "def", "abc", "abc", "cba", "def"));

        int i = 0;
        while (i < words.size()) {
            if (words.get(i).equals("abc")) {              // премахване на няколко едни и същи елементи от Лист.
                words.remove(i);
            } else {
                i++;
            }
        }
        for (String text : words) {
            System.out.print(text + " ");                  // отпечатване на елементите.
        }
    }

}
