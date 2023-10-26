class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Labrador extends Dog {
    void play() {
        System.out.println("Labrador is playing fetch");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Labrador labrador = new Labrador();
        labrador.eat();   // Inherited from Animal
        labrador.bark();  // Inherited from Dog
        labrador.play();  // Defined in Labrador class
    }
}
