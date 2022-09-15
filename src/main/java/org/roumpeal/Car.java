package org.roumpeal;

public class Car {
    private final String model;
    private final int doors;

    public Car(final String model, final int doors) {
        this.model = model;
        this.doors = doors;
    }

    public String getModel() {
        return model;
    }

    public int getDoors() {
        return doors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", doors=" + doors +
                '}';
    }
}
