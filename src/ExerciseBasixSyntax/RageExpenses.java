package ExerciseBasixSyntax;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        int headset = 0;
        int mouse = 0;
        int keyboard = 0;
        int display = 0;
        for (int i = 0; i < lostGames; i++) {
            headset++;
            mouse++;
            keyboard++;
            display++;
        }
        int trashedHeadset = headset / 2;
        int trashedMouse =  mouse / 3;
        int trashedKeyboards = keyboard / 6;
        int trashedDisplay = display / 12;
        double rageExpenses = trashedHeadset * headsetPrice + trashedMouse * mousePrice + trashedKeyboards * keyboardPrice + trashedDisplay * displayPrice;
        System.out.printf("Rage expenses: %.2f lv.", rageExpenses);
    }
}






