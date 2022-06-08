package AssociativeArrays.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resource = scanner.nextLine();

        Map<String, Integer> collection = new LinkedHashMap<>();

        while (!resource.equals("stop")) {

            String quantity = scanner.nextLine();

           /*
            collection.putIfAbsent(resource,0);
            collection.put(resource,collection.get(resource) + Integer.parseInt(quantity));

            това може да се използва да замени If проверката, прави същото.
           */


            if (!collection.containsKey(resource)) {
                collection.put(resource,Integer.parseInt(quantity));
            } else {
                collection.put(resource,collection.get(resource) + Integer.parseInt(quantity));
            }

           resource = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : collection.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
