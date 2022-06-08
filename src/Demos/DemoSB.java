package Demos;

public class DemoSB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hellowhatsup");


        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }
}
