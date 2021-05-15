package hu.nive.ujratervezes.zarovizsga.cleaning;

public class Office implements Cleanable{
    private static final int PRICE = 100;
    private final String address;
    private final int area;
    private final int floor;

    public Office(String address, int area, int floor) {
        this.address = address;
        this.area = area;
        this.floor = floor;
    }

    @Override
    public int clean() {
        return PRICE * area * floor;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public boolean isOffice(){ return true; }

    public int getArea() {
        return area;
    }

    public int getFloor() {
        return floor;
    }

    }
