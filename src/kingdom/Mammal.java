package kingdom;

public class Mammal extends AbstractAnimal {

    private String name;
    private int year;

    public Mammal(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int getYear() {
        return this.year;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String move() {
        return "The " + this.name + " walked a few steps and lost 1 energy.";
    }

    @Override
    public String breath() {
        return "The " + this.name + " took a breathe through it's lungs.";
    }

    @Override
    public String reproduce() {
        return "The " + this.name + " had a successful live birth.";
    }

    @Override
    public String toString() {
        return "\n Mammal{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}