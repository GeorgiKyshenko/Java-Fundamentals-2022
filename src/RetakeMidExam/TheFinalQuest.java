package RetakeMidExam;

import java.util.*;

public class TheFinalQuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");
        List<String> words = new ArrayList<>(Arrays.asList(strings));

        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            String[] line = command.split(" ");
            String action = line[0];

            switch (action) {
                case "Delete":
                    int index = Integer.parseInt(line[1]);
                    if (words.size() >= index + 1 && index > 0) {
                        words.remove(index + 1);
                    }
                    break;
                case "Swap":
                    String first = line[1];
                    String second = line[2];
                    if (words.contains(first) && words.contains(second)) {
                        int firstWord = words.indexOf(first);
                        int secondWord = words.indexOf(second);
                        words.set(firstWord,second);
                        words.set(secondWord,first);
                    }
                    break;
                case "Put":
                    break;
                case "Sort":
                    break;
                case "Replace":
                    break;
            }


            command = scanner.nextLine();
        }
        System.out.printf("");

    }
}
