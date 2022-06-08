package TextProcessing;

public class StringBuilder {
    public static void main(String[] args) {

        java.lang.StringBuilder str = new java.lang.StringBuilder();
        for (int i = 0; i < 100; i++) {
            str.append(i);
        }
        String s = str.toString();
        System.out.println(s);
    }
}
