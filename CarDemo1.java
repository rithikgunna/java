class Vehicle {
    String brand;
    String model;
    int year;

    void start() {
        System.out.println("The " + brand + " " + model + " has started.");
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    void honk() {
        System.out.println("Honk! Honk!");
    }
}

public class CarDemo1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.model = "Camry";
        myCar.year = 2022;
        myCar.numberOfDoors = 4;

        myCar.start();
        myCar.honk();
    }
}
//This example introduces inheritance. The Car class inherits attributes and methods from the Vehicle class and adds its own unique attributes and methods.