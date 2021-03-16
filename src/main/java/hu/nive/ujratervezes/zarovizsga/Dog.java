package hu.nive.ujratervezes.zarovizsga;

public abstract class Dog {
    private String name;
    protected int happiness;

    public Dog(String name) {
        this.name = name;
        this.happiness = 0;
    }

    abstract void feed();

    abstract void play(int hours);

    public String getName() {
        return name;
    }

    public int getHappiness() {
        return happiness;
    }

}
