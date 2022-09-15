package org.roumpeal;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nHello world!! This is Alex Roub");
        System.out.println("I want to show you a new car!");

        Car car = new Car("Tesla X", 5);
        System.out.println("Model is " + car.getModel() + " and it has " + car.getDoors() + " doors!");
    }
}