package com.codecool.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class SetTasks {
    public Set<Integer> union(Set<Integer> a, Set<Integer> b) {
        var res = new HashSet<>(a);
        res.addAll(b);
        return res;
    }

public Set<Integer> intersect(Set<Integer> a, Set<Integer> b) {
        Set<Integer> res = new HashSet<>();
        for (Integer n : a) {
            if(b.contains(n)) res.add(n);
        }
        return res;
    }

    public Set<Integer> difference(Set<Integer> a, Set<Integer> b) {
        Set<Integer> res = new HashSet<>(a);
        for (Integer n : a) {
            if(b.contains(n)) res.remove(n);
        }
        return res;

    }

    public Set<Integer> symmetricalDifference(Set<Integer> a, Set<Integer> b) {
        return difference(union(a, b), intersect(a, b));
    }
}
