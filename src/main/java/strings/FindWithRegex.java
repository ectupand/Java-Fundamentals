package strings;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWithRegex {
    private static final String FULL_STRING = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
    private static final String STRING_PATTERN = "Java\s*[1-9][1-9]?";

    public static void main(String[] args) {
        substringsWithRegex(FULL_STRING, STRING_PATTERN);
    }

    private static void substringsWithRegex(String fullString, String stringPattern){
        Pattern regex = Pattern.compile(stringPattern);
        Matcher matcher = regex.matcher(fullString);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
