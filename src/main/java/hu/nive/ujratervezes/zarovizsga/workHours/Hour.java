package hu.nive.ujratervezes.zarovizsga.workhours;

import java.time.LocalDate;

public class Hour {
    private String name;
    private int hours;
    private LocalDate day;

    public Hour() {
    }

    public Hour(String name, int hours, LocalDate day) {
        this.name = name;
        this.hours = hours;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    public LocalDate getDay() {
        return day;
    }

}
