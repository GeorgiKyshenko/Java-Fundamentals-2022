package RetakeFinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repetitions = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < repetitions; i++) {
            String lines = scanner.nextLine();
            Pattern pattern = Pattern.compile("(?<name>[A-Z][a-z]{3,}\\s[A-Z][a-z]{3,})([#]+)(?<job>\\w+&?\\w+&?\\w+)\\d{2}(?<company>[A-Z]\\w+\\d?\\s[Ltd.|JSC]+)");
            Matcher match = pattern.matcher(lines);
            if(match.find()) {
                String name = match.group("name");
                String job = match.group("job");
                String[] newJob = job.split("&");
                String company = match.group("company");
                System.out.printf("%s is %s at %s%n",name,String.join(" ",newJob),company);
            }
        }
    }
}
