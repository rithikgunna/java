class Car {
    String brand;
    String model;
    int year;

    void start() {
        System.out.println("The " + brand + " " + model + " has started.");
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.model = "Camry";
        myCar.year = 2022;

        myCar.start();
    }
}
//This is a basic example that defines a Car class with attributes and a method. It demonstrates how to create an object of the class and call its method.