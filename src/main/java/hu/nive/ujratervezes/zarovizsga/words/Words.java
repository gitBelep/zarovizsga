package hu.nive.ujratervezes.zarovizsga.words;

public class Words {

    public boolean hasMoreDigits(String s){
        if (s.isBlank()){
            return false;
        }
        int counter = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)){
                counter++;
            }
        }
        return (counter > s.length()-counter);
    }

}
