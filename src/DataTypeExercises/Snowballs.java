package DataTypeExercises;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int snowBalls = Integer.parseInt(scanner.nextLine());
        double snowBallValue = 0;
        int maxSnowBallSnow = 0;
        int maxSnowBallTime = 0;
        int maxSnowBallQuality = 0;

        for (int i = 0; i < snowBalls; i++) {
            int snowBallSnow = Integer.parseInt(scanner.nextLine());
            int snowBallTime = Integer.parseInt(scanner.nextLine());
            int snowBallQuality = Integer.parseInt(scanner.nextLine());
            double currentValue = Math.pow((snowBallSnow / snowBallTime), snowBallQuality);
            if (currentValue > snowBallValue) {
                snowBallValue = currentValue;
                maxSnowBallSnow = snowBallSnow;
                maxSnowBallTime = snowBallTime;
                maxSnowBallQuality = snowBallQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", maxSnowBallSnow, maxSnowBallTime, snowBallValue, maxSnowBallQuality);
    }
}