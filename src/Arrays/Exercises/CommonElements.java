package Arrays.Exercises;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    String[] firstArr = scanner.nextLine().split(" ");
    String[] secondArr = scanner.nextLine().split(" ");
        for (String second: secondArr) {                  // Минаваме през всички елементи на 2рият масив
            for (String first:firstArr) {                 // За всеки елемент от вторият масив правим фор цикъл, който сравнява елементите.
                if (second.equals(first)) {
                    System.out.print(first + " ");
                }
            }
        }

    }
}
