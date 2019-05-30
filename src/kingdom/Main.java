package kingdom;

import java.util.*;

public class Main {

    public static ArrayList<AbstractAnimal> printAnimals(ArrayList<AbstractAnimal> animals, CheckAnimal tester) {
        ArrayList<AbstractAnimal> sortedList = new ArrayList<AbstractAnimal>();
        animals.forEach((animal) -> {
            if(tester.test(animal)) {
                sortedList.add(animal);
            }
        });
        return sortedList;
    }

    public static void executeOps(ArrayList<AbstractAnimal> animals) {
        //1

        System.out.println("Task One: (List all the animals in descending order by year named)");

        animals.sort((v1, v2) -> v2.getYear() - v1.getYear());
        System.out.println(animals.toString());
        System.out.println();

        //2

        System.out.println("Task Two: (List all the animals alphabetically)");

        animals.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        System.out.println(animals.toString());
        System.out.println();

        //3

        System.out.println("Task Three: (List all the animals order by how they move)");

        System.out.println(printAnimals(animals, a -> (a instanceof Bird)).toString() + printAnimals(animals, a -> (a instanceof Fish)).toString() + printAnimals(animals, a -> (a instanceof Mammal)).toString());
        System.out.println();

        //4

        System.out.println("Task Four: (List only those animals the breath with lungs)");

        System.out.println(printAnimals(animals, a -> (a instanceof Mammal) || (a instanceof Bird)).toString());
        System.out.println();

        //5

        System.out.println("Task Five: (List only those animals that breath with lungs and were named in 1758)");

        System.out.println(printAnimals(animals, a -> ((a instanceof Mammal) || (a instanceof Bird)) && a.getYear() == 1758).toString());
        System.out.println();

        //6

        System.out.println("Task Six: (List only those animals that lay eggs and breath with lungs)");

        System.out.println(printAnimals(animals, a -> (a instanceof Bird)).toString());
        System.out.println();

        //7

        System.out.println("Task Seven: (List alphabetically only those animals that were named in 1758)");
        ArrayList<AbstractAnimal> taskseven = new ArrayList<AbstractAnimal>();
        taskseven = printAnimals(animals, a -> a.getYear() == 1758);
        taskseven.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        System.out.println(taskseven.toString());
    }

    public static void main(String[] args) {

        Mammal lemur = new Mammal("Lemur", 1780);
        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal raccoon = new Mammal("Raccoon", 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 2021);


        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);

        Fish perch = new Fish("Perch", 1829);
        Fish catfish = new Fish("Catfish", 1817);
        Fish salmon = new Fish("Salmon", 1758);

        ArrayList<AbstractAnimal> animals = new ArrayList<AbstractAnimal>();

        animals.add(lemur);
        animals.add(panda);
        animals.add(zebra);
        animals.add(koala);
        animals.add(sloth);
        animals.add(armadillo);
        animals.add(raccoon);
        animals.add(bigfoot);
        animals.add(pigeon);
        animals.add(peacock);
        animals.add(toucan);
        animals.add(parrot);
        animals.add(swan);
        animals.add(perch);
        animals.add(catfish);
        animals.add(salmon);

        System.out.println();

        System.out.println(animals.toString());

        System.out.println();

        executeOps(animals);

    }
}