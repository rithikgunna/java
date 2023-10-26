public class MethodExample {
    public static void main(String[] args) {
        // Calling a method and printing the result
        int sum = addNumbers(5, 3);
        System.out.println("The sum is: " + sum);
        
        // Calling a method to display a message
        displayMessage("Hello, World!");
    }
    
    // Method to add two numbers and return the result
    public static int addNumbers(int a, int b) {
        return a + b;
    }
    
    // Method to display a message
    public static void displayMessage(String message) {
        System.out.println(message);
    }
}
