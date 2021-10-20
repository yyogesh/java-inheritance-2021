package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Vehicle obj = new Vehicle("Audi");
//        obj.printDetails();

//        Vehicle obj1 = new Vehicle("Audi", "White", 2021, "Q5");
//        obj1.printDetails();

        Car elantraSedan = new Car("Hyundai", "Red", 2019, "Elantra", "Sedan"); //creation of car Object
        elantraSedan.carDetails(); //calling method to print details

        Bike bmw = new Bike("BMW", "Red", 2021, "R1", "Cruz"); //creation of car Object
        bmw.bikeDetails(); //calling method to print details
    }
}
