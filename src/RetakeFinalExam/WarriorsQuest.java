package RetakeFinalExam;

import java.util.Scanner;

public class WarriorsQuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String skill = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("For Azeroth")) {
            if (command.contains("GladiatorStance")) {
                skill = skill.toUpperCase();
                System.out.println(skill);
            } else if (command.contains("DefensiveStance")) {
                skill = skill.toLowerCase();
                System.out.println(skill);
            } else if (command.contains("Dispel")) {
                String[] data = command.split(" ");
                int index = Integer.parseInt(data[1]);
                char[] chars = data[2].toCharArray();
                char removeLetter = chars[0];
                char charIndex = skill.charAt(Integer.parseInt(data[1]));
                if (index < 0 || index > skill.length() - 1) {
                    System.out.println("Dispel too weak.");
                } else {
                    skill = skill.replaceFirst(String.format("%s",Character.toString(charIndex)),Character.toString(removeLetter));
                    System.out.println("Success!");
                }
            } else if (command.contains("Target Change")) {
                String[] data = command.split(" ");
                String substring = data[2];
                String replaceString = data[3];
                if (skill.contains(substring)) {
                    skill = skill.replace(substring, replaceString);
                    System.out.println(skill);
                } else {
                    System.out.println(skill);
                }
            } else if (command.contains("Target Remove")) {
                String[] data = command.split(" ");
                String remove = data[2];
                skill = skill.replace(remove, "");
                System.out.println(skill);
            } else {
                System.out.println("Command doesn't exist!");
            }
            command = scanner.nextLine();
        }
    }
}
