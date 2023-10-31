import java.io.*;
import java.util.ArrayList;
import java.util.List;

// User class representing information about a user
class User implements Serializable {
    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User: " + username + ", Email: " + email;
    }
}

// Main class for serialization and deserialization
public class UserSerializationExample {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Alice", "alice@example.com"));
        users.add(new User("Bob", "bob@example.com"));
        users.add(new User("Charlie", "charlie@example.com"));

        // Serialize users to a file
        serializeUsers(users);

        // Deserialize users from the file and display
        List<User> deserializedUsers = deserializeUsers();
        if (deserializedUsers != null) {
            System.out.println("Deserialized Users:");
            for (User user : deserializedUsers) {
                System.out.println(user);
            }
        }
    }

    // Serialize user list to a file
    private static void serializeUsers(List<User> users) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("users.ser"))) {
            out.writeObject(users);
            System.out.println("Users have been serialized and saved as users.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // Deserialize user list from the file
    private static List<User> deserializeUsers() {
        List<User> deserializedUsers = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("users.ser"))) {
            deserializedUsers = (List<User>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return deserializedUsers;
    }
}
