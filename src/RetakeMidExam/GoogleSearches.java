package RetakeMidExam;

import java.util.Scanner;

public class GoogleSearches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyPerSearch = Double.parseDouble(scanner.nextLine());
        int users = Integer.parseInt(scanner.nextLine());
        double totalMoney = 0;
        int newUser = 0;

        for (int i = 0; i < users; i++) {
            newUser++;
            int numberOfSearches = Integer.parseInt(scanner.nextLine());
            if (numberOfSearches > 5 && newUser % 3 != 0) {
                totalMoney += (moneyPerSearch * 2) * numberOfSearches;
            } else if (numberOfSearches > 1 && newUser % 3 != 0) {
                totalMoney += numberOfSearches * moneyPerSearch;
            }

            if (newUser % 3 == 0) {
                if (numberOfSearches > 5) {
                    totalMoney += numberOfSearches * (((moneyPerSearch) * 3) * 2);
                } else if (numberOfSearches > 1) {
                    totalMoney += (moneyPerSearch * 3) * numberOfSearches;
                }
            }

        }
        System.out.printf("Total money earned: %.2f", totalMoney);
    }
}
