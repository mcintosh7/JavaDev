package company.creatures;

import company.devices.Saleable;

import java.io.File;

public class Animal implements Saleable {
    final static Double MIN_WEIGHT = 2.0;
    final public String species;
    public Boolean isAlive = true;
    public String name;
    private Double weight = 10.0;
    File pic;

    public String toString() {
        return this.species + " " + name + " " + this.weight;
    }

    //konstruktor klasy
    public Animal(String species) {
        this.species = species;
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
            System.out.println("you cannot walk with a dead pet");
        } else {
            this.weight -= walkWeight;
            System.out.println("thx for walk" + this.weight);
        }
    }

    //getter
    public Double getWeight() {
        return weight;
    }

    //setter
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    //nadpisana metoda z interface'u Saleable
    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {

    }
}