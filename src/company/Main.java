package company;

public class Main {

    public static void main(String[] args) {

        Animal cat = new Animal("cat", 10.0);
        //double i = cat.weight;

        while (cat.weight > 0) {
            cat.takeForAWalk(1.5);
            System.out.println("waga zwierzęcia o gatunku" + " " + cat.species + " to " + cat.weight);
        }

        /*cat.takeForAWalk(6);
        cat.feed(0.1);
        cat.feed(0.1);
        cat.takeForAWalk(5);
        cat.feed(0.5);

        Car opel = new Car("Opel", "Astra", 2010, "blue");
        System.out.println(opel.mark + " " + opel.model + " " + opel.year);

        Car audi = new Car("Audi", "A4", 2018, "pink");
        */


    }
}
