package hu.nive.ujratervezes.zarovizsga.cleaning;

public class House implements Cleanable{
    private static final int PRICE = 80;
    private final String address;
    private final int area;


    public House(String address, int area) {
        this.address = address;
        this.area = area;
    }

    @Override
    public int clean() {
        return PRICE * area;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public boolean isOffice(){ return false; }

    public int getArea() {
        return area;
    }

}
