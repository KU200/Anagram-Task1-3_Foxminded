import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class AnagramMaker {

    public String revers(String input) {
        String output = "";
        ArrayList<String> separated = separate(input);
        for (int i = 0; i < separated.size(); i++) { // TODO: use foreach here
            output += reverseWord(separated.get(i)) + " "; // TODO: use StringBuilder here. Why?
        }
        return output.trim();
    }

    private ArrayList<String> separate(String input) {
        ArrayList<String> inputArray = new ArrayList<>();
        for (String word : input.split(" ")) { // TODO: maybe foreach ?
            inputArray.add(word);
        }
        return inputArray;
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
