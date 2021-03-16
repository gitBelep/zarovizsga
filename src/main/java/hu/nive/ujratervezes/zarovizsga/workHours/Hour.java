package hu.nive.ujratervezes.zarovizsga.workhours;

public class Hour {
    private String name;
    private int hours;
    private String date;

    public Hour() {
    }

    public Hour(String name, int hours, String date) {
        this.name = name;
        this.hours = hours;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    public String getDate() {
        return date;
    }
}
