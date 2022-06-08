package List;

import java.util.ArrayList;
import java.util.List;

public class IntInList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(); // за char - Character, double - Double, int - Integer.
        numbers.add(1);
        numbers.add(1);
        numbers.add(0);


        numbers.remove(0); // тази команда премахва индекса на нулева позиция в Лист.


        Integer x = 0;          //тази команда премахва индекса в който стойността е равна на 0.
        numbers.remove(x);      //трябва задължително да се посочи Integer, Double, Character (с int,double,char премахва позиция)


        for (int n : numbers) {
            System.out.println(n);
        }

    }
}
