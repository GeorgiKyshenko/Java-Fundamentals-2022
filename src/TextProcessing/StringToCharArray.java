package TextProcessing;
import java.util.Arrays;

public class StringToCharArray {
    public static void main(String[] args) {
        String text = "Hello";
        char[] ch = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            ch[i]= text.charAt(i);
        }
        System.out.println(Arrays.toString(ch));

    }
}
