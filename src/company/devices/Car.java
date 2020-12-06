package company.devices;

import company.creatures.Human;

public class Car extends Device implements Saleable {
    private final String color;
    public Double value;


    public Car(String producer, String model, int year, String color, Double value) {
        super(producer, model, year);
        this.color = color;
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public void turnOn() {
        System.out.println("put key");
        System.out.println("press button");
    }

    @Override
    public String toString() {
        return producer + " " + model + " " + year + " " + color + " " + value;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (seller.getCash() == null || buyer.getCash() == null) {
            throw new Exception("Musisz zdefiniować stan portfela");
        }
        if (seller.getCar() == null) {
            System.out.println("Nie masz samochodu");
            throw new Exception("Brak telefonu");
        }
        if (buyer.getCash() < price) {
            System.out.println("Kupujący, nie masz kasy ");
            throw new Exception("Bak pieniędzy");
        }
        buyer.setCash(buyer.getCash() - price);
        seller.setCash(seller.getCash() + price);
        buyer.setCar(seller.getCar());
        seller.setCar(null);
        System.out.println("telefon sprzedano za " + price + " od " + seller.firstName + " do " + buyer.firstName);

    }

}
