package company.devices;

public class Car extends Device {
    private final String color;
    public Double value;


    public Car(String producer, String model, int year, String color, Double value) {
        this.producer = producer;
        this.model = model;
        this.year = year;
        this.color = color;
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
