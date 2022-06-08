package AssociativeArrays.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split("\\s+");

        Map<Character, Integer> result = new LinkedHashMap<>();

        for (String s : text) {
            for (int i = 0; i <s.length(); i++) {
                char symbol = s.charAt(i);
                if (!result.containsKey(symbol)){
                    result.put(symbol, 1);
                } else {
                    result.put(symbol,result.get(symbol) + 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
