package oop.company.vehicles;

public class SportCar extends Car{
    private double speed;

    public SportCar(String model, double speed) {
        super(model);
        this.speed = speed;
    }
}
