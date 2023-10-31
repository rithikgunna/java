 import java.util.*;

// Unique Main class for Tree, Map, Set - EmployeeHierarchy
public class EmployeeHierarchy {
    public static void main(String[] args) {
        // Using TreeMap to represent the employee hierarchy
        Map<String, String> employeeTreeMap = new TreeMap<>();

        // Adding employees to the hierarchy
        employeeTreeMap.put("CEO", "John Doe");
        employeeTreeMap.put("Manager", "Alice Smith");
        employeeTreeMap.put("Developer", "Bob Johnson");

        // Displaying the employee hierarchy
        System.out.println("Employee Hierarchy:");
        for (Map.Entry<String, String> entry : employeeTreeMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
