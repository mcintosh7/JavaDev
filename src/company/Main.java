package company;

import company.creatures.Human;
import company.devices.Car;
import company.devices.Phone;

public class Main {

    public static void main(String[] args) {

       /*

        Animal cat = new Animal("cat");
        cat.takeForAWalk();
        cat.feed(0.5);
        cat.feed(0.3);
        cat.takeForAWalk();
        cat.feed(0.3);

        cat = new Animal("tiger");
        cat.feed(2.0);

        */

        Human me = new Human();
        System.out.println(me.getSalary());

        me.setSalary(70000000.0);
        System.out.println(me.getSalary());

        Car opel = new Car("Opel", "Astra", 1999, "black", 5000.5);
        me.setCar(opel);

        System.out.println(me.getCar().model + " " + me.getCar().producer + " " + me.getCar().year);
        //System.out.println(me.);

        //System.out.println(me instanceof Human);
        //System.out.println(me instanceof Animal);

        Phone nokia = new Phone(2010, "nokia", "3310i");
        Car opel2 = new Car("opel", "corsa", 2011, "blue", 15000.0);

        System.out.println(nokia);
        System.out.println(opel2);

    }
}
