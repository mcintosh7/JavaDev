package company.devices;

public abstract class Device {
    final public String producer;
    final public String model;
    final public int year;

    public Device(String producer, String model, int year) {
        this.producer = producer;
        this.model = model;
        this.year = year;
    }

    public abstract void turnOn();

    public String toString() {
        return this.producer + " " + this.model + " " + this.year;
    }


}


