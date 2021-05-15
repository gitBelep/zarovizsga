package hu.nive.ujratervezes.zarovizsga.countchars;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

class DaVinciCode {

    public int encode(String input, char c){
        revise(c);
        try {
            String s = Files.readString(Path.of(input), StandardCharsets.UTF_8);
            int counter = 0;
            char[] chars = s.toCharArray();
            for(char ch : chars){
                if (ch == c){
                    counter++;
                }
            }
            return counter;
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);}
    }

    private void revise(char c){
        String enableds = "1x0";
        if(!enableds.contains(Character.toString(c))){
            throw new IllegalArgumentException("False character");
        }
    }

}
