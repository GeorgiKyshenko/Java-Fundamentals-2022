import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int[] number = new int[]{1, 2, 3, 4, 5};
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i]);
            if (i > 0) {
                System.out.print(" - ");
            }
        }
    }
}
