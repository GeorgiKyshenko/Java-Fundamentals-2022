package AssociativeArrays;

import com.sun.source.tree.Tree;

import java.util.*;

public class StringsMap {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "bye", "the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog");

        Map<Integer, List<String>> wordsByLength = new TreeMap<>();
        for (String word : words) {
            int key = word.length();
            List<String> values = wordsByLength.get(key);
            if (values == null) {
                values = new ArrayList<>();
                wordsByLength.put(key, values);
            }
            values.add(word);
        }
        for (Map.Entry<Integer, List<String>> entry : wordsByLength.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            for (String word: entry.getValue()) {
                System.out.print(word + ", ");
            }
            System.out.println();
        }
    }
}
