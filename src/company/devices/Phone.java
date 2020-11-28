package company.devices;

public class Phone extends Device {
    Double screenSize;


    public String toString() {
        return this.producer + " " + this.model + " " + this.screenSize;
    }

}

