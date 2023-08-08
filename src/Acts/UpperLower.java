package Acts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UpperLower {

    public static void main(String[] args) {
        String sentence = "StackTrek";
        Pattern pattern = Pattern.compile("[A-Z][a-z]");
        Matcher matcher = pattern.matcher(sentence);
        boolean matchFound = matcher.find();
        System.out.println(matchFound);

    }
}
