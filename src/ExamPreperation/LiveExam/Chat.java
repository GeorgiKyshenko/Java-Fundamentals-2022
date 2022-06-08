package ExamPreperation.LiveExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] array = command.split(" ");
            String line = array[0];
            switch (line) {
                case "Chat":
                    list.add(array[1]);
                    break;
                case "Delete":
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).equals(array[1])) {
                            list.remove(i);
                            break;
                        }
                    }
                    break;
            }
            if (line.equals("Spam")){
                for (int i = 1; i < array.length; i++) {
                    list.add(array[i]);
                }
            } else if (line.equals("Pin")){
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).equals(array[1])) {
                        list.add(array[1]);
                        list.remove(list.get(i));
                    }
                }
            } else if (line.equals("Edit")) {
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).equals(array[1])) {
                        list.set(i, array[2]);
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
