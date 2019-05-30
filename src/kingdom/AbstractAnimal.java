package kingdom;

public abstract class AbstractAnimal implements Animal {

    public static int id = 0;
    protected int energy;

    public AbstractAnimal() {
        this.id = id++;
        this.energy = 10;
    }

    public abstract int getYear();
    public abstract String getName();
    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();

    public void eat() {
        this.energy ++;
    }

}