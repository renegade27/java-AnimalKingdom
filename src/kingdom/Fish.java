package kingdom;

public class Fish extends AbstractAnimal {

    private String name;
    private int year;

    public Fish(String name, int year) {
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
        return "The " + this.name + " swam 100 yards and lost 1 energy.";
    }

    @Override
    public String breath() {
        return "The " + this.name + " took a breathe through it's gills.";
    }

    @Override
    public String reproduce() {
        return "The " + this.name + " had an egg successfully hatch.";
    }

    @Override
    public String toString() {
        return "\n Fish{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}