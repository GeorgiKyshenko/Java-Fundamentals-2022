package ExerciseBasixSyntax;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLightSabers = Double.parseDouble(scanner.nextLine());
        double priceOfRobes = Double.parseDouble(scanner.nextLine());
        double priceOfBelts = Double.parseDouble(scanner.nextLine());
        double lightSabers = 0;
        int robes = 0;
        int belts = 0;
        for (int i = 0; i < countOfStudents; i++) {
            lightSabers++;
            robes++;
            belts++;
        }
        lightSabers = Math.ceil(lightSabers * 1.10);
        int allBelts = belts - belts / 6;
        double totalLightSabers = lightSabers * priceOfLightSabers;
        double totalRobes = robes * priceOfRobes;
        double totalBelts = allBelts * priceOfBelts;
        double totalPrice = totalLightSabers + totalBelts + totalRobes;
        if (totalPrice <= amountOfMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.",totalPrice - amountOfMoney);
        }
    }
}


