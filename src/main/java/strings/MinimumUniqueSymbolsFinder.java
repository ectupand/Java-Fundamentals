package strings;

import java.util.HashSet;
import java.util.Set;

public class MinimumUniqueSymbolsFinder {
    private static final String GIVEN_STRING = "fffff ab f 1234 jkjk";

    public static void main(String[] args) {
        System.out.println(minUniqueSymbols(GIVEN_STRING));
    }

    private static String minUniqueSymbols(String givenString){
        if (givenString.isEmpty()){
            return null;
        }
        Set<Character> existSymbols = new HashSet<>();
        int minUniqueSymbols = 0;
        int uniqueSymbols = 0;
        String minString = "";
        StringBuilder currentString = new StringBuilder();
        for (int i=0; i<=givenString.length(); i++){
            if (i == givenString.length() || givenString.charAt(i) == ' '){
                if (uniqueSymbols == 1){
                    return currentString.toString();
                }else if (minUniqueSymbols > uniqueSymbols){
                    minUniqueSymbols = uniqueSymbols;
                    minString = currentString.toString();
                }
                existSymbols.clear();
                uniqueSymbols = 0;
                currentString = new StringBuilder();
            }else{
                currentString.append(givenString.charAt(i));
                if (!existSymbols.contains(givenString.charAt(i))){
                    existSymbols.add(givenString.charAt(i));
                    uniqueSymbols+=1;
                }
            }
        }
        return minString;
    }
}
