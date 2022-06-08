package FinalExamPreperation;

import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Reveal")) {
            String[] data = command.split(":\\|:");
            String operation = data[0];
            switch (operation) {
                case "InsertSpace":
                    int index = Integer.parseInt(data[1]);
                    sb.insert(index, " ");
                    break;
                case "Reverse":
                    StringBuilder substringText = new StringBuilder(data[1]);
                    String substring = data[1];
                    if (sb.toString().contains(substring)) {
                        int start = sb.indexOf(String.valueOf(substringText));
                        int end = start + substringText.length() - 1;
                        sb.delete(start, end + 1);
                        substringText.reverse();

                        sb.append(substringText);
                    } else {
                        System.out.println("error");
                        command = scanner.nextLine();
                        continue;
                    }
                    break;
                case "ChangeAll":
                    String string = data[1];
                    String replacement = data[2];
                    String replacedString = sb.toString().replaceAll(string, replacement);
                    sb.setLength(0);
                    sb.append(replacedString);
                    break;
            }
            System.out.println(sb);
            command = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", sb);

    }
}
