package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class readingListFromConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            list.add(numbers);
        }
        System.out.print(list + " ");
    }
}
