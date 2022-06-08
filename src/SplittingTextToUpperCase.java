import java.util.Arrays;
import java.util.Locale;

public class SplittingTextToUpperCase {
    public static void main(String[] args) {
        String text = "TellMeAboutYou";
        String[] array = text.split("(?=[A-Z])");
        System.out.println(Arrays.toString(array));               //Инт масив може да се принтира само с sout(array)
        for (String s :array) {
            System.out.print(s + " ");
        }                                                            // но, текстов масив с (Arrays.toString(array))
    }
}
