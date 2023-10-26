//Dynamic method dispatch is a concept in object-oriented programming (OOP), and it is closely related to method overriding in languages like Java. It allows the selection of which method to call at runtime, based on the actual type of the object rather than the reference type.

//In dynamic method dispatch:
//It is used when a subclass provides a specific implementation for a method that is already defined in its superclass. This is known as method overriding.

//The method to be executed is determined at runtime, based on the type of the object being referenced. This allows for polymorphism, where objects of different subclasses can be treated as objects of their superclass.

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class DynamicMethodDispatchExample {
    public static void main(String[] args) {
        Animal myAnimal;

        myAnimal = new Animal();
        myAnimal.makeSound(); // Calls the method from Animal class

        myAnimal = new Dog();
        myAnimal.makeSound(); // Calls the method from Dog class

        myAnimal = new Cat();
        myAnimal.makeSound(); // Calls the method from Cat class
    }
}
//In this example, we create objects of different classes and assign them to a reference variable of type Animal. When the makeSound method is called on each object, the method executed is determined at runtime based on the actual type of the object, demonstrating dynamic method dispatch.

//Dynamic method dispatch allows for more flexible and extensible code because it enables you to work with objects of different derived classes through a common base class reference.