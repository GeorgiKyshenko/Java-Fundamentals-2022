import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FillingArrayWithList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        int[] numbers2 = numbers.stream()
                .mapToInt(n -> n)
                .toArray();


        for (int a : numbers2) {
            System.out.print(a + " ");
        }
        System.out.println();

        // Запълване на List със стойности на масив и отпечатване
        // ->>

        int[] integer = new int[]{1, 2, 3};

        List<Integer> abv = new ArrayList<>();
        for (int n : integer) {
            abv.add(n);
        }
        abv.forEach(el -> System.out.print(el + " "));

    }
}


