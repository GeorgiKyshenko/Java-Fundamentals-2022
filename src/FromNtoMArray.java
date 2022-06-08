import java.util.Arrays;
import java.util.Scanner;

public class FromNtoMArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int[] array = new int[m - n];

        for (int i = n; i < m; i++) {
            array[i-n] = i;
        }
        System.out.print(Arrays.toString(array));
    }
}
