import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrintOutDelimiter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(Arrays.stream(String.join(",", scanner.nextLine()).split(" ")).mapToInt(Integer::parseInt).filter(x -> x % 2 == 0).sum());
    }
}
