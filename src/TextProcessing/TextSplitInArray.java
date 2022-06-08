package TextProcessing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextSplitInArray {
    public static void main(String[] args) {
        String text = "the quick, brown fox jumps, over the lazy, dog";
        String[] arrayText = text.split(", ");

        /* String[] arrayText = text.split("[, .]+"); това ще сплитне по всички символи които намери(запетайка, спейс или точка).
           плюса означава "един или повече на брой такива елементи" */

        System.out.print(Arrays.toString(arrayText));
    }
}
