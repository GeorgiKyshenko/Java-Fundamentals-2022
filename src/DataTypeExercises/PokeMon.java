package DataTypeExercises;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustion = Integer.parseInt(scanner.nextLine());
        int pokedTarget = 0;
        double halfPokePower = pokePower * 0.50;
        while (pokePower >= distance) {
            pokePower -= distance;
            pokedTarget++;
            if (pokePower == halfPokePower && exhaustion != 0) {
                pokePower /= exhaustion;
            }
        }
        System.out.println(pokePower);
        System.out.println(pokedTarget);
    }
}

