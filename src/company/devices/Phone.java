package company.devices;

public class Phone extends Device {
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

}

