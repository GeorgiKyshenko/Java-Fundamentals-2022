package List.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String commands = scanner.nextLine();
        while (!commands.equals("End")) {
            String[] array = commands.split(" ");
            String command = array[0];

            switch (command) {
                case "Add":
                    list.add(Integer.parseInt(array[1]));
                    break;
                case "Insert":
                    int number = Integer.parseInt(array[1]);
                    int index = Integer.parseInt(array[2]);
                    if (index < 0  || index >= list.size()) {
                        System.out.println("Invalid index");
                    } else {
                        list.add(index,number);
                    }
                    break;
                case "Remove":
                    index = Integer.parseInt(array[1]);
                    if (index < 0  || index >= list.size()) {
                        System.out.println("Invalid index");
                    } else {
                        list.remove(index);
                    }
                    break;
                case "Shift":
                    int count = Integer.parseInt(array[2]);
                    if (array[1].equals("left")) {
                        for (int i = 0; i < count; i++) {
                            list.add(list.get(0));
                            list.remove(list.get(0));
                        }
                    } else {
                        for (int i = 0; i < count; i++) {
                            list.add(0, list.get(list.size() - 1));
                            list.remove(list.size() - 1);
                        }
                    }
                    break;
            }
            commands = scanner.nextLine();
        }
        list.forEach(el -> System.out.print(el + " "));
    }
}
