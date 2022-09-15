package org.roumpeal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!! This is Alex Roub");
        System.out.println("I want to show you a new feature!");
        System.out.println("This is the new feature!");
        System.out.println("This is the updated feature!");
        System.out.println("This is the addition!");
        System.out.println("This is the addition 1!");
        System.out.println("This is the addition 2!");

        Car car = new Car("Tesla X Y", 5);
        System.out.println("Model is" + car.getModel() + " and it has " + car.getDoors() + " doors.");
    }
}