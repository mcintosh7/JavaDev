package company.devices;

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
    public void sell() {
        System.out.println("method sell");
    }

    @Override
    public void sellOnCredit() {
        System.out.println("method sellOnCredit");
    }
}
