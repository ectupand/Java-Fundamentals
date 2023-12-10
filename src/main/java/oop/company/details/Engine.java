package oop.company.details;

public class Engine {
    private final int power;
    private final String manufacturer;

    public Engine(int power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }

    public int getPower() {
        return power;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
