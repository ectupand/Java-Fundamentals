package strings;

import java.util.Arrays;
import java.util.Objects;

public class TautologyFixer {
    private static final String TO_REPLACE = "object-oriented programming";
    private static final String CORRECT_WORD = "OOP";
    private static final String GIVEN_STRING = ("Object-oriented programming is a programming language model " +
            "organized around objects rather than \"actions\" and data rather than logic. object-oriented " +
            "programming blabla. Object-oriented programming bla.");


    public static void main(String[] args) {
        //System.out.println(toFixedUsingArray(GIVEN_STRING, TO_REPLACE, CORRECT_WORD));
        System.out.println(toFixedUsingString(GIVEN_STRING, TO_REPLACE, CORRECT_WORD));
    }
    private static String toFixedUsingArray(String givenString, String toReplace, String correctWord){
        int n = 0;
        int k = 0;
        String[] givenArray = givenString.split(" ");
        String[] repeatingWord = toReplace.split(" ");
        for (int i=0; i<givenArray.length; i++) {
            if (Objects.equals(givenArray[i].toLowerCase(), repeatingWord[n])){
                if (Objects.equals(givenArray[i+1].toLowerCase(), repeatingWord[n+1])){
                    k+=1;
                }
                if (k == 2){
                    givenArray[i] = correctWord;
                    givenArray[i+1] = givenArray[i+1].substring(0);
                    k = 0;
                }
            }
        }
        return String.join(" ", givenArray);
    }
    private static String toFixedUsingString(String givenString, String toReplace, String correctWord){
        int replaceIndex = givenString.indexOf(
                toReplace.toLowerCase(),
                givenString.indexOf(toReplace.toLowerCase()+1)
        );
        String beforeWord = givenString.substring(0, replaceIndex);
        String afterWord = givenString.substring(replaceIndex+toReplace.length());
        return beforeWord + correctWord + afterWord;
    }
}
