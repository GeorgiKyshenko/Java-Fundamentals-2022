import java.util.Arrays;
import java.util.Scanner;

public class LowestHighestInArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int highest = numbers[0];
        int lowest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
            if (numbers[i] > highest) {
                highest = numbers[i];
            }

        }
        System.out.println(highest);
        System.out.print(lowest);
    }
}

