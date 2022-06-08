package TextProcessing;

public class RepeatedSymbol {
    public static void main(String[] args) {
        String text = "the quick brown fox jumps over the lazy dog";
        String[] bannedWords = new String[]{"jumps", "lazy"};
        for (String word : bannedWords) {
            if (text.contains(word)) {
                String censored = repeat("*", word.length());
                text = text.replace(word, censored);
            }
        }
        System.out.println(text);

    }

    private static String repeat(String word, int repetition) {
        char[] repeated = new char[word.length() * repetition];
        for (int i = 0; i < repeated.length; i++) {
            repeated[i] = word.charAt(i % word.length());
        }
        return new String(repeated);
    }
}
