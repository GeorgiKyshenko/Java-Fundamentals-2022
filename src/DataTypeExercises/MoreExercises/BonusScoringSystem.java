package DataTypeExercises.MoreExercises;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        int lectures = Integer.parseInt(scanner.nextLine());
        int bonuses = Integer.parseInt(scanner.nextLine());
        int overallAttendance = 0;
        double maxBonus = 0.0;
        for (int i = 0; i < students; i++) {
            int attendance = Integer.parseInt(scanner.nextLine());
            double totalBonus = (attendance / (double) lectures) * (5 + bonuses);
            if (totalBonus > maxBonus) {
                maxBonus = totalBonus;
                overallAttendance = attendance;
            }
        }
        System.out.printf("Max Bonus: %d.", Math.round(maxBonus));
        System.out.println();
        System.out.printf("The student has attended %d lectures.", overallAttendance);
    }
}
