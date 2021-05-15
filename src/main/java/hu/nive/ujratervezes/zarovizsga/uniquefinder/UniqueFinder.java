package hu.nive.ujratervezes.zarovizsga.uniquefinder;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueFinder {

    public List<Character> uniqueChars(String str){
        if (str == null){
            throw new IllegalArgumentException("Text is null");
        }

        Set<Character> result = new LinkedHashSet<>();
        char[] chars = str.toCharArray();
        for(Character c : chars){
            if (!result.contains(c)){
                result.add(c);
            }
        }
        return new ArrayList<>(result);
    }

}
