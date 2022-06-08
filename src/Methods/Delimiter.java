package Methods;

public class Delimiter {
    static void print45() {
        int x = 45;
        System.out.println(x);
    }                        //принтиране на числото 45.


    static void delimiter(int dividerLength, char symbol) {        //dividerLength и symbol са параметри на метода!
        for (int i = 0; i < dividerLength; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }


    static void delimiter(int dividerLength) {   // това е метод който вика същият метод с дефолтен символ.
        delimiter(dividerLength,'*');     // -> т.е ако не съм здал символ, да отпечатва винаги звезда '*'.
    }  // overload на методи


    public static void main(String[] args) {
        print45();
        delimiter(5, '-');
        print45();
        delimiter(5, '+');
        print45();
        delimiter(5);
    }
}
