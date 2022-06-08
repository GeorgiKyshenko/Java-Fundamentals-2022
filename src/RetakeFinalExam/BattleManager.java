package RetakeFinalExam;

import java.util.*;

public class BattleManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Integer>> data = new LinkedHashMap<>();



        String command = scanner.nextLine();
        while (!command.equals("Results")) {
            if (command.contains("Add")) {
                String[] info = command.split(":");
                String name = info[1];
                int health = Integer.parseInt(info[2]);
                int energy = Integer.parseInt(info[3]);
                if (!data.containsKey(name)) {
                    data.put(name, new ArrayList<>());
                    data.get(name).add(health);
                    data.get(name).add(energy);
                } else {
                    data.get(name).set(0, data.get(name).get(0) + health);
                }
            }
            if (command.contains("Attack")) {
                String[] info = command.split(":");
                String attackerName = info[1];
                String defenderName = info[2];
                int damage = Integer.parseInt(info[3]);

                if (data.containsKey(attackerName) && data.containsKey(defenderName)) {
                    data.get(defenderName).set(0, data.get(defenderName).get(0) - damage);
                    data.get(attackerName).set(1, data.get(attackerName).get(1) - 1);
                    if (data.get(defenderName).get(0) <= 0) {
                        data.remove(defenderName);
                        System.out.printf("%s was disqualified!%n", defenderName);
                    }
                    if (data.get(attackerName).get(1) <= 0) {
                        data.remove(attackerName);
                        System.out.printf("%s was disqualified!%n", attackerName);
                    }
                }
            }
            if (command.contains("Delete")) {
                String[] info = command.split(":");
                String username = info[1];
                if(username.equals("All")) {
                    data.clear();
                } else {
                    data.remove(username);
                }
            }
            command = scanner.nextLine();
        }
        System.out.printf("People count: %d",data.size());
        System.out.println();
        data.forEach((k,v) -> System.out.printf("%s - %d - %d%n",k,v.get(0), v.get(1)));
    }
}
