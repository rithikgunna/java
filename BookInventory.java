import java.util.ArrayList;
import java.util.List;

// Unique Main class for Collections - BookInventory
class BookInventory {
    public static void main(String[] args) {
        // Using a List to manage book inventory
        List<String> bookList = new ArrayList<>();

        // Adding books to the inventory
        bookList.add("Book A");
        bookList.add("Book B");
        bookList.add("Book C");

        // Displaying the book inventory
        System.out.println("Book Inventory:");
        for (String book : bookList) {
            System.out.println(book);
        }
    }
}
