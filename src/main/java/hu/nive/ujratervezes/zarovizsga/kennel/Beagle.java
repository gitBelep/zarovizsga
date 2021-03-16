package hu.nive.ujratervezes.zarovizsga.kennel;

public class Beagle extends Dog {

    public Beagle(String name) {
        super(name);
    }


    @Override
    public void feed() {
        super.happiness += 2;
    }

    @Override
    public void play(int hours) {
        super.happiness += 2 * hours;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getHappiness() {
        return super.happiness;
    }

}
