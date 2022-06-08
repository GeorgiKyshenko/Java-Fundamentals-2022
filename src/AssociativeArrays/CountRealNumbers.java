package AssociativeArrays;

import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>(Arrays.<Double>asList(8.0, 2.0, 2.0, 8.0, 2.0));

        Map<Double, Integer> numberCounts = new TreeMap<>();
        for (Double number : numbers) {
            Integer currentNumber = numberCounts.get(number);
            if (currentNumber != null) {
                numberCounts.put(number, currentNumber + 1);
            } else {
                numberCounts.put(number, 1);
            }
        }
        for (Map.Entry<Double, Integer> entry : numberCounts.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
