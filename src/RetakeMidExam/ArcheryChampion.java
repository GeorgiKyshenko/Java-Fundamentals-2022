package RetakeMidExam;

import java.util.*;

public class ArcheryChampion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\|"))
                .mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();
        int points = 0;

        while (!command.equals("Game over")) {

            if (command.contains("Left")) {
                String[] data = command.split("@");
                int startIndex = Integer.parseInt(data[1]);
                int length = Integer.parseInt(data[2]);
                if (startIndex < 0 || startIndex > numbers.length - 1) {
                    command = scanner.nextLine();
                    continue;
                }
                while (length > 0) {
                    if (startIndex < 0) {
                        startIndex = numbers.length - 1;
                    }
                    startIndex--;
                    length--;
                }
                if (numbers[startIndex] < 5) {
                    points += numbers[startIndex];
                    numbers[startIndex] = 0;
                } else {
                    points += 5;
                    numbers[startIndex] -= 5;
                }
            }
            if (command.contains("Right")) {
                String[] data = command.split("@");
                int startIndex = Integer.parseInt(data[1]);
                int length = Integer.parseInt(data[2]);
                if (startIndex < 0 || startIndex > numbers.length - 1) {
                    command = scanner.nextLine();
                    continue;
                }

                while (length > 0) {
                    if (startIndex > numbers.length - 1) {
                        startIndex = 0;
                    }
                    startIndex++;
                    length--;
                }
                if (numbers[startIndex] < 5) {
                    points += numbers[startIndex];
                    numbers[startIndex] = 0;
                } else {
                    points += 5;
                    numbers[startIndex] -= 5;
                }
            }
            if (command.contains("Reverse")) {
                for (int i = 0; i < numbers.length / 2; i++) {
                    int currentNumber = numbers[i];
                    numbers[i] = numbers[numbers.length - i - 1];
                    numbers[numbers.length - i - 1] = currentNumber;
                }
            }

            command = scanner.nextLine();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if(i <numbers.length -1) {
                System.out.print(" - ");
            }
        }
        System.out.println();
        System.out.printf("John finished the archery tournament with %d points!", points);

    }
}
