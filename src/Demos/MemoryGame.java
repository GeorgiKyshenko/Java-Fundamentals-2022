package Demos;

import java.util.*;
import java.util.stream.Collectors;

public class MemoryGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> seq = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String command = scanner.nextLine();
        int numbersOfMove = 0;

        while (!command.equals("end")) {
            numbersOfMove++;
            String[] indexes = command.split(" ");
            int index1 = Integer.parseInt(indexes[0]);
            int index2 = Integer.parseInt(indexes[1]);

            if (index1 >= 0 && index2 >= 0 && index1 < seq.size() && index2 < seq.size() && index1 != index2) {
                if (seq.get(index1).equals(seq.get(index2))) {
                    System.out.println("Congrats! You have found matching elements" + " " + "-" + " " + seq.get(index1) + "!");
                    if (index1 > index2) {
                        seq.remove(index1);
                        seq.remove(index2);
                    } else {
                        seq.remove(index2);
                        seq.remove(index1);
                    }
                    if (seq.size() == 0) {
                        System.out.printf("You have won in %d turns!", numbersOfMove);
                        return;
                    }
                } else {
                    System.out.println("Try again!");
                }
            }
            if (index1 == index2 || index1 < 0 || index2 < 0) {
                System.out.println("Invalid input! Adding additional elements to the board");
                seq.add(seq.size() / 2, "-" + numbersOfMove + "a");
                seq.add(seq.size() / 2, "-" + numbersOfMove + "a");
            }
            command = scanner.nextLine();
        }
        System.out.println("Sorry you lose :(");
        for (String s : seq) {
            System.out.print(s + " ");
        }
    }
}
