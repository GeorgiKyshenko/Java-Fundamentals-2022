package List.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] input = command.split(" ");
            if (input[0].equals("Delete")) {
                int number = Integer.parseInt(input[1]);
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) == (number)) {
                        list.remove(i);
                        i--;
                    }
                }
            }
            if (input[0].equals("Insert")) {
                int number = Integer.parseInt(input[1]);
                int number1 = Integer.parseInt(input[2]);
                list.add(number1, number);
            }
            command = scanner.nextLine();
        }
        list.forEach(el-> System.out.print(el + " "));
    }
}

