package TextProcessing;

import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {

        Set<Character> letters  = new TreeSet<>();    //Set са като Мар, но съдържат само ключове.

        String text = "the quick brown fox jumps over the lazy dog";
        for (int i = 0; i < text.length(); i++) {
            letters.add(text.charAt(i));
        }
        for (Character letter:letters) {
            System.out.print(letter);
        }
    }
}
