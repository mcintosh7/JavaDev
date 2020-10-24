package company;

import java.io.File;

public class Animal {
    final String species;
    static String name;
    private Double weight = 10.0;
    File pic;

    public Animal(String species) {
        this.species = species;
    }

    void feed(Double foodWeight) {
        if (this.weight <= 0) {
            System.out.println("to late");
        } else {
            System.out.println("thx for food" + this.weight);
            this.weight += foodWeight;
        }
    }

    void takeForAWalk() {
        if (this.weight <= 0) {
            System.out.println("you cannot walk with a dead pet");
        } else {
            this.weight--;
            System.out.println("thx for walk" + this.weight);
        }
    }


    Double getWeight() {
        return weight;
    }

}
