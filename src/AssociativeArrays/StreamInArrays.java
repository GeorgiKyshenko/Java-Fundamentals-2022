package AssociativeArrays;

import java.util.Arrays;

public class StreamInArrays {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] result = Arrays.stream(numbers)
                .filter(n -> n % 3 == 0)
                .map(n -> n * 2)
                .toArray();

        for (int Integer:result) {
            System.out.println(Integer+ " ");
        }


        String[] strings = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};

        int[] result1 = Arrays.stream(strings)
                .mapToInt(s -> Integer.parseInt(s))      //За да използваме парсване с map в int масив, трябва да е ->
                .filter(n -> n % 3 == 0)                 // mapToInt, противен случай Object[], защото map не работи с примитивни данни.
                .map(n -> n * 2)                         //само List използва map, защотото е List<Integer>, List<String>...
                .toArray();

        for (int Integer:result1) {
            System.out.println(Integer+ " ");
        }
    }
}
