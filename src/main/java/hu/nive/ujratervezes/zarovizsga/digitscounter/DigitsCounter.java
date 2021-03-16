package hu.nive.ujratervezes.zarovizsga.digitscounter;

import java.util.HashSet;
import java.util.Set;

public class DigitsCounter {

    public int getCountOfDigits(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        char[] ch = s.toCharArray();
        Set<Integer> digits = new HashSet<>();
        for (Character c : ch) {
            if (Character.isDigit(c)) {
                digits.add(Integer.parseInt(String.valueOf(c)));
            }
        }
        return digits.size();
    }

}
