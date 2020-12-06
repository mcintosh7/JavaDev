package company.devices;

import company.creatures.Human;

public class Phone extends Device implements Saleable {
    Double screenSize;

    public Phone(Integer year, String producer, String model) {
        super(producer, model, year);
        this.screenSize = screenSize;
    }


    @Override
    public void turnOn() {
        System.out.println("press and hold button");
    }

    public String toString() {
        return this.producer + " " + this.model + " " + this.screenSize;
    }


    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (seller.getCash() == null || buyer.getCash() == null) {
            throw new Exception("Musisz zdef portfel");
        }
        if (seller.phone == null) {
            System.out.println("you don't phone");
            throw new Exception("no phone");
        }
        if (buyer.getCash() < price) {
            System.out.println("enought cash");
            throw new Exception("no cash");
        }
        buyer.setCash(buyer.getCash() - price);
        seller.setCash(buyer.getCash() + price);
        buyer.phone = seller.phone;
        seller.phone = null;
        System.out.println("tel sprzedano za" + price + "od" + seller.firstName + "do");
    }
}

