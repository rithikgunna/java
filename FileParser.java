// Unique Main class for Exception Handling - FileParser
class FileParser {
    public static void main(String[] args) {
        // Simulating exception handling while parsing a file
        try {
            int data = 100 / 0; // Causes an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("An arithmetic error occurred: " + e);
        }
    }
}
