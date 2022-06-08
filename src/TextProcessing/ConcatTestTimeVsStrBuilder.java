package TextProcessing;

import java.util.Date;

public class ConcatTestTimeVsStrBuilder {
    public static void main(String[] args) {
        System.out.println(new Date());
        java.lang.StringBuilder str = new java.lang.StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            str.append(i);
        }
        System.out.println(new Date());
    }
}
