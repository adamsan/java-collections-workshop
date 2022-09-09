package com.codecool.collections.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTasks {

    public void removeElement(List<String> words, String valueToRemove) {
        Iterator<String> it = words.iterator();
        while (it.hasNext()){
            String next = it.next();
            if(next.equals(valueToRemove)){
                it.remove();
            }
        }
    }

    public List<String> getListWithout(List<String> words, String valueToRemove) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if(!word.equals(valueToRemove))
                result.add(word);
        }
        return result;
    }
}
