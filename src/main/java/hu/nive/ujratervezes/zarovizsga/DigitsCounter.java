package hu.nive.ujratervezes.zarovizsga;

import java.util.HashSet;
import java.util.Set;

public class DigitsCounter {

    public int getCountOfDigits(String s){
        String[] numbers = s.split("");
        Set<Integer> digits = new HashSet<>();
        try {
            for (int i = 0; i < numbers.length; i++) {
                digits.add(Integer.parseInt(numbers[i]));
            }
        } catch (NumberFormatException ne){
            System.out.println("Not only digits are in this string");
        }
        return digits.size();
    }

}
