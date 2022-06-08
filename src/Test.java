public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Some textS");
        int removeWord = sb.indexOf("S");
        sb.replace(removeWord,1,"a");
        String text = "sdada";
        text = text.concat("opalq");
        int remove = text.indexOf("d");
        System.out.println(sb);
         text = text.replaceAll(String.valueOf(remove),"v");
        System.out.println(text);
    }
}
