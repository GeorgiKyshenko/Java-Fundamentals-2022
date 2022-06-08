package Methods;

public class MinNumInArray {
    static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        // System.out.println(min); може да се намира "min" и да се принтира едновременно, но не е правилна практика за методи !
        return min;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{5, 2, 8, 10, -42};
        int min = findMin(numbers);
        System.out.print(min);
    }
}

