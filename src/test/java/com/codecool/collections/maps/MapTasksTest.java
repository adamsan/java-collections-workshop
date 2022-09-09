package com.codecool.collections.maps;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MapTasksTest {

    @Test
    void mapTest() {
        MapTasks sut = new MapTasks();
        Map<Character, Integer> result = sut.getFrequency("banana");
        Map<Character, Integer> expected = Map.of('b', 1, 'a', 3, 'n', 2);
        assertEquals(expected, result);
    }

    @Test
    void firstWordWithLengthTest() {
        MapTasks sut = new MapTasks();
        Map<Integer, String> result = sut.firstWordWithLength(
                "abba edda acdc elvis U2 U3"
        );
        Map<Integer, String> expected = Map.of(4, "abba", 5, "elvis", 2, "U2");
        assertEquals(expected, result);
    }

    @Test
    void wordsWithLengthTest() {
        MapTasks sut = new MapTasks();
        Map<Integer, List<String>> result = sut.lengthWordsMap(
                "abba edda acdc elvis U2 U3"
        );
        Map<Integer, List<String>> expected = Map.of(
                4, List.of("abba", "edda", "acdc"),
                5, List.of("elvis"),
                2, Arrays.asList("U2", "U3"));
        assertEquals(expected, result);
    }


}
