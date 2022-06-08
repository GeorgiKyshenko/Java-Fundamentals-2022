package AssociativeArrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String digitName = scanner.nextLine();

        Map<String, Integer> digitValue = new HashMap<>();    // HashMap не гарантира принтиране по последователен начин,
                                                              // за това се използва LinkedHashMap. TreeMap ги подрежда по азбучен ред на ключа.
        digitValue.put("zero", 0);
        digitValue.put("one", 1);
        digitValue.put("two", 2);                               // <- "two" е key, 2 е value.
        digitValue.put("three", 3);
        digitValue.put("four", 4);

        //digitValue.remove("two");      премахване на стойности от Мар.

        for (Map.Entry<String, Integer> entry : digitValue.entrySet()) {      //итерация на всички стойности в Мар - а и принтиране.
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }


        // System.out.println(digitValue.get(digitName));

    }
}
