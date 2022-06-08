package ExamPreperation;

import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] targetsValue = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        String command = scanner.nextLine();
        int shotCounts = 0;
        while (!command.equals("End")) {
            int index = Integer.parseInt(command);
            if (index >= 0 && index < targetsValue.length) {
                for (int i = 0; i < targetsValue.length; i++) {
                    int shootTarget = targetsValue[index];
                    if (i != index && targetsValue[i] != -1) {
                        targetsValue[index] = -1;
                        shotCounts++;
                        if (targetsValue[i] > shootTarget) {
                            targetsValue[i] -= shootTarget;
                        } else {
                            targetsValue[i] += shootTarget;
                        }
                    }
                }
            }
            command = scanner.nextLine();
        }
        System.out.printf("Shot targets %d -> ", shotCounts);
        for (int n : targetsValue) {
            System.out.print(n + " ");
        }
    }
}
