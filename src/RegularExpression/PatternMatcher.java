package RegularExpression;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\b[a-z]+\\b");
        String text = "Hello what Is Up how Are you my Friend whaaaaats going On";
        Matcher matcher = pattern.matcher(text);

        boolean foundSomething = matcher.find();
        while (foundSomething) {
            System.out.println(matcher.group());
            foundSomething = matcher.find();
        }

    }
}

