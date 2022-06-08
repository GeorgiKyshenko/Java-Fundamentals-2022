package Methods;

public class VoidContainsReturn {
    static void printNumbers(int n) {
        for (int i = 1; i <= 100; i++) {
            if (i == n) {
                return;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printNumbers(10);

    }
}
