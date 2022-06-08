package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class indexOf {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("hello", "world", "whats up"));
        int index = words.indexOf("nothing");          //ако въведената дума я няма в Лист-а, връща резултат " - 1 "

        if (index == - 1) {
            System.out.println("not found");
        } else {
            System.out.println("found");
        }
    }
}
