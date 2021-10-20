package com.company;

public class Vehicle {
    // Private Fields
    private String make;
    private String color;
    private int year;
    private String model;

    public Vehicle() {
        System.out.println("Default Class Constructor");
    }
//    public Vehicle(String make) {
//        System.out.println("Class Constructor " + make);
//        this.make = make;
//    }

    // Parameterized Constructor
    public Vehicle(String make, String color, int year, String model) {
        this.make = make;
        this.color = color;
        this.year = year;
        this.model = model;
    }

    // public method to print details
    public void printDetails() {
        System.out.println("Manufacturer: " + make);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Model: " + model);
    }
}

class Car extends Vehicle {
    // Private field
    private String bodyStyle;

    // Parameterized Constructor
    public Car(String make, String color, int year, String model, String bodyStyle) {
        super(make, color, year, model);  //calling parent class constructor
        this.bodyStyle = bodyStyle;
    }

    public void carDetails() {  //details of car
        printDetails();         //calling method from parent class
        System.out.println("Body Style: " + bodyStyle);
    }
}

class Bike extends Vehicle {
    // Private field
    private String bodyStyle;

    // Parameterized Constructor
    public Bike(String make, String color, int year, String model, String bodyStyle) {
        super(make, color, year, model);  //calling parent class constructor
        this.bodyStyle = bodyStyle;
    }

    public void bikeDetails() {  //details of car
        printDetails();         //calling method from parent class
        System.out.println("Body Style: " + bodyStyle);
    }
}
