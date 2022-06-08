import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntArrayToIntegerListStream {
    public static void main(String[] args) {
        int[] abv = new int[]{1, 2, 3};

        List<Integer> cde = Arrays.stream(abv)
                .boxed()
                .collect(Collectors.toList());
        for (int n : cde) {
            System.out.print(n + " ");
        }


    }
}
