package Methods;

import java.util.Scanner;

public class PrintTriangleNumbers {
    static void IncreasingNumber(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i < n) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            IncreasingNumber(i);
        }
        for (int i = n-1; i >=0 ; i--) {
            IncreasingNumber(i);
        }
    }
}
