package TextProcessing;

public class RemoveOrReplace {
    public static void main(String[] args) {
        String text = "the quick brown fox jumps over the lazy dog";

        String removeWord = "the";

        while (text.contains(removeWord)) {

            text = text.replace(removeWord,"");
        }
        System.out.println(text);

    }

}
