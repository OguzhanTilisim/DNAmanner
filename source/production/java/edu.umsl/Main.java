package edu.umsl;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new cat());
        animals.add(new dog());

        List<Plant> plants = new ArrayList<Plant>();
        plants.add(new avacado());
        plants.add(new bonzai());

        List<Fungi> fungi = new ArrayList<Fungi>();
        fungi.add(new oyster());
        fungi.add(new oneki());

        for (Plant plant : plants) {
            System.out.println(plant);
        }
        System.out.println();
        for (Animal animal : animals) {
            System.out.println(animal);
        }
        System.out.println();
        for (Fungi fungus : fungi) {
            System.out.println(fungus);
        }

    }
}
