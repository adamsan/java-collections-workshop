package com.codecool.collections.sets;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SetTasksTest {

    @Test
    void unionTest() {
        Set<Integer> a = Set.of(4, 5, 6);
        Set<Integer> b = Set.of(6, 7, 8);
        Set<Integer> union = new SetTasks().union(a, b);
        assertTrue(union.containsAll(a));
        assertTrue(union.containsAll(b));
    }

    @Test
    void intersectTest() {
        Set<Integer> a = Set.of(4, 5, 6);
        Set<Integer> b = Set.of(6, 7, 8);
        Set<Integer> union = new SetTasks().intersect(a, b);
        assertTrue(union.contains(6));
        assertEquals(1, union.size());
    }

    @Test
    void differenceTest() {
        Set<Integer> a = Set.of(4, 5, 6);
        Set<Integer> b = Set.of(6, 7, 8);
        Set<Integer> union = new SetTasks().difference(a, b);
        assertTrue(union.contains(4));
        assertTrue(union.contains(5));
        assertEquals(2, union.size());
    }

    @Test
    void symmetricalDifferenceTest() {
        Set<Integer> a = Set.of(4, 5, 6);
        Set<Integer> b = Set.of(6, 7, 8);
        Set<Integer> union = new SetTasks().symmetricalDifference(a, b);
        assertTrue(union.contains(4));
        assertTrue(union.contains(5));
        assertTrue(union.contains(7));
        assertTrue(union.contains(8));
        assertEquals(4, union.size());
    }
}
