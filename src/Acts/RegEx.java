package Acts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

    public static void main(String[] args) {
        String sentence = "StackTrek";
        Pattern pattern = Pattern.compile("k");
        Matcher matcher = pattern.matcher(sentence);
        boolean matchFound = matcher.find();
        System.out.println(matchFound);

    }
}
