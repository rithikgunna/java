import java.util.*;

// Unique Main class for Stream API and forEach - ShoppingCart
public class ShoppingCart {
    public static void main(String[] args) {
        // Using Stream API to process shopping cart items
        List<String> cartItems = Arrays.asList("Item1", "Item2", "Item3", "Item4");

        // Displaying items in the shopping cart using forEach method
        System.out.println("Items in the Shopping Cart:");
        cartItems.stream().forEach(item -> System.out.println(item));
    }
}
