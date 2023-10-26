//This example demonstrates polymorphism, where objects of different classes can be treated as objects of a common superclass and exhibit different behavior based on their actual class.
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.makeSound();  // Output: Animal makes a sound
        myDog.makeSound();     // Output: Dog barks
        myCat.makeSound();     // Output: Cat meows
    }
}
