package oop.company.vehicles;

import oop.company.details.Engine;
import oop.company.professions.Driver;

public class Car {
    private final String model;
    private String _class;
    private double weight;
    private Driver driver;
    private Engine engine;

    public Car(String model, String _class, double weight, Driver driver, Engine engine) {
        this.model = model;
        this._class = _class;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public Car(String model) {
        this.model = model;
    }

    public void start(){
        System.out.println("Lecgo");
    }
    public void stop(){
        System.out.println("Performing stoppance");
    }
    public void turnRight(){
        System.out.println("Righter");
    }
    public void turnLeft(){
        System.out.println("Lefter");
    }


    @Override
    public String toString() {
        return ("Car: "
                + model + " "
                + _class + ", "
                + weight + " lb\nDriver: "
                + driver.toString() + "\nEngine: "
                + engine.toString()
        );
    }
}
