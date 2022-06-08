package Demos;

import java.util.Scanner;

public class CharIsDigit {
    public static void main(String[] args) {
        String s = "aaa23zaazac42acaacaz324aazab23ay";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println(sum);
    }
}



