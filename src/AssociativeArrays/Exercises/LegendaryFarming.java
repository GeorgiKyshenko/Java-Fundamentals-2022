package AssociativeArrays.Exercises;

import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String winner = "";

        Map<String, Integer> items = new LinkedHashMap<>();
        items.put("shards", 0);
        items.put("fragments", 0);
        items.put("motes", 0);

        /* Map<String, String> printWinner = new HashMap<>();
        printWinner.put("fragments", "Valanyr obtained!");
        printWinner.put("shards", "Shadowmourne obtained!");
        printWinner.put("motes", "Dragonwrath obtained!");
        */
        boolean hasWinner = false;

        while (!hasWinner) {
            String[] line = scanner.nextLine().split(" ");
            for (int i = 0; i < line.length - 1; i += 2) {

                int quantity = Integer.parseInt(line[i]);
                String material = line[i + 1].toLowerCase();

                items.putIfAbsent(material, 0);
                items.put(material, items.get(material) + quantity);
                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    if (items.get(material) >= 250) {
                        items.put(material, items.get(material) - 250);
                        winner = material;
                        hasWinner = true;
                        break;
                    }
                }
            }
        }
        /*това замества switch метода като създадем нов Map от стрингове и принтираме winner

        System.out.println(printWinner.get(winner));

        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        } */

        switch (winner) {
            case "fragments":
                System.out.println("Valanyr obtained!");
                break;
            case "shards":
                System.out.println("Shadowmourne obtained!");
                break;
            case "motes":
                System.out.println("Dragonwrath obtained!");
                break;
        }
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}

