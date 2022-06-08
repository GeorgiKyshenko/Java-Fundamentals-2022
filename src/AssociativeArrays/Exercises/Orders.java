package AssociativeArrays.Exercises;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> products = new LinkedHashMap<>();

        String line = scanner.nextLine();
        while (!line.equals("buy")) {
            String[] data = line.split(" ");
            String name = data[0];
            double price = Double.parseDouble(data[1]);
            double quantity = Double.parseDouble(data[2]);


            if (products.containsKey(name)) {
                products.get(name).set(0, price);
                products.get(name).set(1, products.get(name).get(1) + quantity);
            } else {
                products.put(name, new ArrayList<>());            // трябва да създадем нов List, за да добавяме в него.
                products.get(name).add(price);
                products.get(name).add(quantity);
            }
            line = scanner.nextLine();
        }
        products.forEach((k, v) -> System.out.printf("%s -> %.2f%n", k, v.get(0) * v.get(1)));

        /*
        или
        for (Map.Entry<String, List<Double>> entry : products.entrySet()) {
        System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue().get(0) * entry.getValue().get(1));
       }
       */

    }
}

