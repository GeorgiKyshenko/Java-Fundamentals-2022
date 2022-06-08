package FinalExam;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BossRush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repetitions = Integer.parseInt(scanner.nextLine());



        for (int i = 0; i < repetitions; i++) {
            String bosses = scanner.nextLine();
            Pattern bossNames = Pattern.compile("([|#])(?<name>[A-Z]{4,})\\1:([|#])(?<title>[A-Z][a-z]+ [A-z]+)\\3");
            Matcher match = bossNames.matcher(bosses);

            if (match.find()) {
                String name = match.group("name");
                String title = match.group("title");
                System.out.printf("%s, The %s%n",name, title);
                System.out.printf(">> Strength: %d%n" +
                        ">>Armor: %d%n",name.length(),title.length());

            } else {
                System.out.println("Access denied!");
            }
        }
    }
}


