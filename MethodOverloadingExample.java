class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloadingExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result1 = calculator.add(5, 3);         // Calls the int version
        double result2 = calculator.add(2.5, 3.7);  // Calls the double version

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
