//Anonymous Inner Class:

//An anonymous inner class is a type of inner class that is defined and instantiated on the fly, typically as an argument to a method. It doesn't have a separate class name. Anonymous inner classes are often used for quick and temporary implementations of interfaces or abstract classes.
interface Greeting {
    void greet();
}

public class AnonymousInnerClassExample {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello from the anonymous inner class!");
            }
        };
        greeting.greet();
    }
}
