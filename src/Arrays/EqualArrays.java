package Arrays;

public class EqualArrays {
    public static void main(String[] args) {
        int[] firstNumbers = new int[]{2, 5, 7};
        int[] secondNumbers = new int[]{2, 4, 7};
        boolean arraysAreEqual;
        if (firstNumbers.length != secondNumbers.length) {
            arraysAreEqual = false;
        } else {
            arraysAreEqual = true;
            for (int i = 0; i < firstNumbers.length; i++) {
                int a = firstNumbers[i];
                int b = secondNumbers[i];
                if (firstNumbers[i] != secondNumbers[i]) {
                    arraysAreEqual = false;
                }
            }
        }
        System.out.println(arraysAreEqual);
    }
}