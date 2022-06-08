package TextProcessing.Exercises;

public class SystemLineSeparator {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("Georgi");
        sb.append(System.lineSeparator());     //поставя нов ред.
        sb.append("Tngrdjv");
        System.out.println(sb);
    }
}
