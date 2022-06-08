package ExamPreperation.LiveExam;

import java.util.Scanner;

public class SpaceTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] route = scanner.nextLine().split("\\|\\|");
        int fuel = Integer.parseInt(scanner.nextLine());
        int ammunition = Integer.parseInt(scanner.nextLine());

        String[] travel = route[0].split(" ");
        int lightYears = Integer.parseInt(travel[1]);

        for (int i = 0; i < route.length; i++) {
            if (route[i].contains("Travel")) {
                if (fuel >= lightYears) {
                    fuel -= lightYears;
                    System.out.printf("The spaceship travelled %d light-years.%n", lightYears);
                } else {
                    System.out.println("Mission failed.");
                    break;
                }
            } else if (route[i].contains("Enemy")) {
                String[] armor = route[i].split(" ");
                int power = Integer.parseInt(armor[1]);
                if (ammunition >= power) {
                    ammunition -= power;
                    System.out.printf("An enemy with %d armour is defeated.%n", power);
                } else {
                    int consumedPower = power * 2;
                    if (fuel >= consumedPower) {
                        fuel -= consumedPower;
                        System.out.printf("An enemy with %d armour is outmaneuvered.%n", power);
                    } else {
                        System.out.println("Mission failed.");
                        break;
                    }
                }
            } else if (route[i].contains("Repair")) {
                String[] repair = route[i].split(" ");
                int repairNumber = Integer.parseInt(repair[1]);
                int addedFuel = repairNumber;
                int addedAmmunition = repairNumber * 2;
                System.out.printf("Ammunitions added: %d.%n" +
                        "Fuel added: %d.%n", addedAmmunition, addedFuel);
            } else if (route[i].contains("Titan")) {
                System.out.println("You have reached Titan, all passengers are safe.");
            }
        }
    }
}
