import java.util.*;

// Unique Main class for Comparable vs Comparator - StudentSorting
class StudentSorting {
    public static void main(String[] args) {
        // Example demonstrating Comparable interface for sorting
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Alice"));
        students.add(new Student(102, "Bob"));
        students.add(new Student(103, "Charlie"));

        Collections.sort(students); // Sorting using Comparable

        // Displaying sorted students
        System.out.println("Students sorted by ID (using Comparable):");
        for (Student student : students) {
            System.out.println(student);
        }

        // Example demonstrating Comparator interface for sorting
        List<Student> studentsByName = new ArrayList<>();
        studentsByName.add(new Student(101, "Alice"));
        studentsByName.add(new Student(102, "Bob"));
        studentsByName.add(new Student(103, "Charlie"));

        studentsByName.sort(new NameComparator()); // Sorting using Comparator

        // Displaying students sorted by name
        System.out.println("\nStudents sorted by Name (using Comparator):");
        for (Student student : studentsByName) {
            System.out.println(student);
        }
    }
}

// Student class implementing Comparable interface
class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

// Comparator implementation to sort by student name
class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}
