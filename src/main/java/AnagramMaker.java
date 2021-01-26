import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AnagramMaker {

    public String revers(String input) {
        StringBuilder output = new StringBuilder();
        ArrayList<String> separated = separate(input);
        try { for (String word : separated) {
            output.append(reverseWord(word) + " ");
        }
        return output.substring(0, output.length() - 1);} catch (Exception ex) {return null;}
    }

    private ArrayList<String> separate (String input) {
        ArrayList<String> inputWordsArray = new ArrayList<>();
        try {  for (String word : input.split(" ")) {
            inputWordsArray.add(word);
        }
        return inputWordsArray;} catch (Exception ex) {return null;}
    }

    private String reverseWord(String input) {
        StringBuilder reversedWord = new StringBuilder(input);
        Map<Integer, Character> nonLetterMap = new HashMap<>();
        for (int index = 0; index < reversedWord.length(); index++) {
            if (!Character.isLetter(reversedWord.charAt(index))) {
                nonLetterMap.put(index, reversedWord.charAt(index));
                reversedWord.setCharAt(index, ' ');
            }
        }
        reversedWord = removeWhiteSpaces(reversedWord);
        reversedWord.reverse();
        resolveNonLettersChars(reversedWord, nonLetterMap);
        return reversedWord.toString();
    }

    private void resolveNonLettersChars(StringBuilder reversedWord, Map<Integer, Character> nonLetterMap) {
        nonLetterMap.keySet().forEach(index -> reversedWord.insert(index, nonLetterMap.get(index).toString()));
    }

    private static StringBuilder removeWhiteSpaces(StringBuilder input) {
        StringBuilder stringWithoutSpaces = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isWhitespace(input.charAt(i))) {
                stringWithoutSpaces = stringWithoutSpaces.append(input.charAt(i));
            }
        }
        return stringWithoutSpaces;
    }
}
