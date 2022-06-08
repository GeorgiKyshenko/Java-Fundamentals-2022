package AssociativeArrays;

import java.util.Arrays;

public class OptionalInt {
    public static void main(String[] args) {

        String[] strings = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};

        java.util.OptionalInt result = Arrays.stream(strings)
                .mapToInt(el -> Integer.parseInt(el))
                .filter(n -> n > 7)
                .min();

        // ако масива е празен или няма вярна стойност за .filter ->

        if (result.isPresent()) {
            System.out.println(result.getAsInt());
        } else {
            System.out.println("No such number!");
        }
    }
}
