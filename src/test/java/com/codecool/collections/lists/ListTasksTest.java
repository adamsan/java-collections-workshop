package com.codecool.collections.lists;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListTasksTest {
    @Test
    void testRemoveElements() {
        List<String> words = new ArrayList<>();
        words.add("A");
        words.add("B");
        words.add("C");
        words.add("A");
        words.add("B");
        words.add("C");
        words.add("A");
        words.add("B");
        words.add("C");

        ListTasks sut = new ListTasks();
        sut.removeElement(words, "C");
        assertFalse(words.contains("C"));
    }

    @Test
    void testGetListWithout() {
        List<String> words = new ArrayList<>();
        words.add("A");
        words.add("B");
        words.add("C");
        words.add("A");
        words.add("B");
        words.add("C");
        words.add("A");
        words.add("B");
        words.add("C");

        ListTasks sut = new ListTasks();
        List<String> result = sut.getListWithout(words, "C");
        assertTrue(words.contains("C"));
        assertFalse(result.contains("C"));
    }
}
