package oop.company.vehicles;

public class Lorry extends Car{
    private int carrying;

    public Lorry(String model, int carrying) {
        super(model);
        this.carrying = carrying;
    }
}
