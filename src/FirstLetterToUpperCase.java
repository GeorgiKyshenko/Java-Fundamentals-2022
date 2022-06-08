import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FirstLetterToUpperCase {
    public static void main(String[] args) {
        String text = "the quick brow fox jumps over the lazy dog";
        char[] charArray = text.toCharArray();
        boolean foundSpace = true;

        for(int i = 0; i < charArray.length; i++) {

            // if the array element is a letter
            if(Character.isLetter(charArray[i])) {

                // check space is present before the letter
                if(foundSpace) {

                    // change the letter into uppercase
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            }

            else {
                // if the new character is not character
                foundSpace = true;
            }
        }

        // convert the char array to the string
        text = String.valueOf(charArray);
        System.out.println(text);
    }
}
