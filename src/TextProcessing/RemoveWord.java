package TextProcessing;

public class RemoveWord {
    public static void main(String[] args) {

        String text = "the quick brown fox jumps over the lazy dog";

        String removeWord = "fox";
        int removeIndex = text.indexOf(removeWord);

        while (removeIndex != -1) {
            String beforeSplit = text.substring(0,removeIndex);
            String afterRemove = text.substring(removeIndex + removeWord.length());

            /* взимаме removeIndex + removeWord.length за да вземе индекса на който започва думата и да я премахне дължината и.
             за да се започне от новият индекс */

            text = beforeSplit + afterRemove;   // получаваме новият текст и се връщаме в началото за да търсим още
                                                // от същата дума.

            removeIndex = text.indexOf(removeWord);
        }
        System.out.println(text);
    }
}
