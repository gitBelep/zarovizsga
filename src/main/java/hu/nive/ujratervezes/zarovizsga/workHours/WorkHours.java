package hu.nive.ujratervezes.zarovizsga.workhours;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class WorkHours {
    private List<Hour> workedHours = new ArrayList<>();

    public String minWork(String file){
        try (BufferedReader br = new BufferedReader(new InputStreamReader(WorkHours.class.getResourceAsStream(file)))) {
            String line;
            while((line = br.readLine()) != null) {
                createHour(line);
            }
            return chooseMin();
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    private void createHour(String line){
        String[] data = line.split(",");
        String name = data[0];
        int worked = Integer.parseInt(data[1]);
        String date = data[2];
        workedHours.add( new Hour(name, worked, date) );
    }

    private String chooseMin(){
        int min = Integer.MAX_VALUE;
        Hour lazyestWorker = new Hour();
        for (Hour h : workedHours){
            if(h.getHours() < min){
                min = h.getHours();
                lazyestWorker = h;
            }
        }
        return lazyestWorker.getName() +": "+lazyestWorker.getDate();
    }
}
