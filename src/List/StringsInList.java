package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringsInList {
    public static void main(String[] args) {
        List<String> word = new ArrayList<>(Arrays.asList("hello", "world", "whats up")); // механично въвеждане на стринг в Лист.
        word.remove(1);                 // ако няма Arrays.asList, не можем да премахваме/добавяме индекси от Лист-а.
        for (int i = 0; i < word.size(); i++) {
            System.out.println(word.get(i));
        }
    }
}
