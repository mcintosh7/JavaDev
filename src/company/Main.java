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

        Human me = new Human("Arek", "Chmal");
        me.setSalary(10.0);

        Phone nokia = new Phone(2010, "nokia", "3310i");
        Car opel = new Car("opel", "corsa", 2011, "blue", 15000.0);

        me.phone = nokia;
        me.setCar(opel);

        Human brotherInLaw = new Human("Andrzej", "Tester");
        brotherInLaw.setCash(3000.0);

        try {
            nokia.sell(me, brotherInLaw, 2000.0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("dalsza logika");

    }
}
