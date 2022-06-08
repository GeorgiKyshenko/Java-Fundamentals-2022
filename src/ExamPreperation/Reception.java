package ExamPreperation;

import java.util.Scanner;

public class Reception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int employee1 = Integer.parseInt(scanner.nextLine());
        int employee2 = Integer.parseInt(scanner.nextLine());
        int employee3 = Integer.parseInt(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());

        int answersPerHour = employee1 + employee2 + employee3;
        int hours = 0;
        while (studentsCount > 0) {
            hours++;
            if (hours % 4 != 0) {
                studentsCount -= answersPerHour;
            }
        }
        System.out.printf("Time needed: %dh.",hours);


    }
}
