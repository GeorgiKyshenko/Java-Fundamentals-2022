package TextProcessing;

public class Substring2 {
    public static void main(String[] args) {

        String text = "the quick brown fox jumps over the lazy dog";

        char search = 't';
        int index = text.indexOf(search);
        while (index != -1) {                           // -1 се пише, защото може този символ да не съществува в текста.
            System.out.println(index);
            index = text.indexOf(search,index + 1);
        }

        /*този метод търси всички индекси на които се намира този символ (в случая 't') в текста и го принтира. */
    }
}
