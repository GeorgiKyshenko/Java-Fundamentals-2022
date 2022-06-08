package AssociativeArrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaMap {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<String> result = numbers.stream()
                .map(n -> n * 2)                                //  map не връща булева стойност, а действие и връща резултат.
                .map(n -> "number: " + n)
                .collect(Collectors.toList());

        for (String n : result) {
            System.out.print(n + " ");
        }

        List<String> numbersAsString = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");

        List<Integer> result2 = numbersAsString.stream()
                .map(s -> Integer.parseInt(s))
                .map(n -> n * 2)
                .collect(Collectors.toList());

        for (int Integer : result2) {
            System.out.print(Integer + " ");
        }
    }
}
