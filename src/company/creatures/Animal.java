package company.creatures;

import java.io.File;

public class Animal {
    final String species;
    static String name;
    public Double weight;
    File pic;

    public String toString() {
        return this.species + " " + name + " " + this.weight;
    }



    public Animal(String species, Double weight) {
        this.species = species;
        this.weight = weight;
    }

    void feed(double foodWeight) {
        if (this.weight <= 0) {
            System.out.println("to late");
        } else {
            this.weight += foodWeight;
            System.out.println("thx for food" + this.weight);
        }
    }

    void takeForAWalk(double walkWeight) {
        if (this.weight <= 0) {
            //System.out.println("you cannot walk with a dead pet");
        } else {
            this.weight -= walkWeight;
            //System.out.println("thx for walk" + this.weight);
        }
    }



}