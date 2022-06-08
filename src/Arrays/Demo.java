package Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] text = new int[]{10, 21, 31, 41};
        int sum = 0;
        for (int i = 0; i < text.length; i++) {
            for (int j = i + 1; j < text.length; j++) {
                sum = text[i] + text[j];
            }
        }
        System.out.print(sum);
    }
}
