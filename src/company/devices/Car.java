package company.devices;

public class Car extends Device {
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
}
