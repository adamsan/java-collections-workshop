package com.codecool.collections.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTasks {
    public Map<Character, Integer> getFrequency(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : word.toCharArray()) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }

    public Map<Integer, String> firstWordWithLength(String sentence) {
        Map<Integer, String> result = new HashMap<>();
        for (String word : sentence.split(" ")) {
            int key = word.length();
            if(!result.containsKey(key)) result.put(key, word);
        }
        return result;
    }

    public Map<Integer, List<String>> lengthWordsMap(String sentence) {
        Map<Integer, List<String>> result = new HashMap<>();
        for (String word : sentence.split(" ")) {
            int key = word.length();
            if(result.containsKey(key)) {
                result.get(key).add(word);
            } else {
                List<String> wordsWithKeyLength = new ArrayList<>();
                wordsWithKeyLength.add(word);
                result.put(key, wordsWithKeyLength);
            }
        }
        return result;
    }
}
