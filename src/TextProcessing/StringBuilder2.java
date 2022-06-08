package TextProcessing;

public class StringBuilder2 {
    public static void main(String[] args) {
        String text = "the quick brown fox jumps over the lazy dog";

        java.lang.StringBuilder newText = new java.lang.StringBuilder(text);          // <<<<----

        for (int i = 0; i < text.length(); i++) {
            newText.append(text.charAt(i));           // вместо да го довавяме с loop можем да посочим горе в скобите (text)
        }
        newText.replace(0,3,"change text");
        String s = newText.toString();
        System.out.println(s);
    }
}
