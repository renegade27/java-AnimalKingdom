package kingdom;

public class Bird extends AbstractAnimal {

    private String name;
    private int year;

    public Bird(String name, int year) {
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
        return year;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String move() {
        return "The " + this.name + " flew half a mile and lost 1 energy.";
    }

    @Override
    public String breath() {
        return "The " + this.name + " took a breathe through it's lungs.";
    }

    @Override
    public String reproduce() {
        return "The " + this.name + " had an egg successfully hatched.";
    }

    @Override
    public String toString() {
        return "\n Bird{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}