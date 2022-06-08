package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingStringsInList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<String>();

        String word = scanner.nextLine(); // четене на дума от конзолата.

        while (!word.equals(".")) {
            words.add(word);             //добавяне на думта от конзолата ако е различна от точка.
            word = scanner.nextLine();   // прочитане на нова дума.
        }
        for (int i = words.size() - 1; i >= 0 ; i--) {    //обхождане на Листа след като сме го напълнили с думи -
            System.out.println(words.get(i));             //от последният елемент и принтираме резултата. (принтиране отзад - напред)
        }
    }
}
