public class StringExample {
    public static void main(String[] args) {
        // Immutable string
        String immutableStr = "Hello";
        immutableStr = immutableStr + " World"; // This creates a new string object
        System.out.println("Immutable String: " + immutableStr);

        // Mutable string using StringBuilder
        StringBuilder mutableStr = new StringBuilder("Hello");
        mutableStr.append(" World"); // Modifies the same object
        System.out.println("Mutable String: " + mutableStr.toString());
    }
}
