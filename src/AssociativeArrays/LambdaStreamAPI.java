package AssociativeArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaStreamAPI {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> filtered = numbers.stream()
                .filter(num -> num > 2)
                .filter(num -> num < 8 && num % 2 == 0)         //можем да добавим допълнителни филтри ако имаме нужда.
                .collect(Collectors.toList());                  // може и вложена проверка да направим.

        for (int integer : filtered) {
            System.out.print(integer + " ");
        }
        System.out.println();

        // <- това е равно на

        List<Integer> filteredWithLoop = new ArrayList<>();
        for (int number : numbers) {
            if (number > 2) {
                filteredWithLoop.add(number);
            }
        }
        for (int n : filteredWithLoop) {
            System.out.print(n + " ");
        }
    }
}
