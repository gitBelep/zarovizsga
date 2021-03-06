package hu.nive.ujratervezes.zarovizsga.kennel;

public class Husky extends Dog {

    public Husky(String name) {
        super(name);
    }

    @Override
    void feed() {
        happiness += 4;
    }

    @Override
    void play(int hours) {
        happiness += 3 * hours;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getHappiness() {
        return happiness;
    }

}
