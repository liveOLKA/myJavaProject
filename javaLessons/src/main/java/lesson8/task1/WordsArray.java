package lesson8.task1;

import java.util.*;

public class WordsArray {
    public static void main(String[] args) {
        String[] words = new String[]{"black", "red", "white", "pink", "yellow", "green", "brown", "pink", "grey", "blue", "red", "black"};
        HashSet<String> uniqueWords = new HashSet<>();
        HashMap<String, Integer> wordsHashMap = new HashMap<>();
        for (String word : words) {
            if (uniqueWords.contains(word)) {
                wordsHashMap.put(word, wordsHashMap.get(word) + 1);
            } else {
                uniqueWords.add(word);
                wordsHashMap.put(word, 1);
            }
        }
        System.out.println(wordsHashMap);
        System.out.println(uniqueWords);
    }
}


