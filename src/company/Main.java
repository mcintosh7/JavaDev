package company;

public class Main {

    public static void main(String[] args) {

        Animal cat = new Animal("cat");
        cat.takeForAWalk();
        cat.feed(0.5);
        cat.feed(0.3);
        cat.takeForAWalk();
        cat.feed(0.3);

        Car opel = new Car("opel", "astra", 2010, "blue");
        System.out.println(opel.mark + " " + opel.model + " " + opel.year);

    }
}
