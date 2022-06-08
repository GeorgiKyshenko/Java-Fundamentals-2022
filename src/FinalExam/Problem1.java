package FinalExam;

import java.util.Locale;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        String command = scanner.nextLine();

        while ((!command.equals("Abracadabra"))) {
            String[] commandSplit = command.split(" ");
            String spells = commandSplit[0];
            switch (spells) {
                case "Abjuration":
                    line = line.toUpperCase();
                    System.out.println(line);
                    break;
                case "Necromancy":
                    line = line.toLowerCase();
                    System.out.println(line);
                    break;
                case "Illusion":
                    int removeIndex = Integer.parseInt(commandSplit[1]);
                    char[] replacement = commandSplit[2].toCharArray();
                    if (removeIndex != -1 && removeIndex <= line.length()) {
                        line = line.replace(line.charAt(removeIndex), replacement[0]);
                        System.out.println("Done!");
                    } else {
                        System.out.println("The spell was too weak.");
                    }
                    break;
                case "Divination":
                    line = line.replace(commandSplit[1], commandSplit[2]);
                    System.out.println(line);
                    break;
                case "Alteration":
                    if (line.contains(commandSplit[1])) {
                        line = line.replace(commandSplit[1], "");
                        System.out.println(line);
                    } else {
                        continue;
                    }
                    break;
                default:
                    System.out.println("The spell did not work!");
            }

            command = scanner.nextLine();
        }
    }
}
