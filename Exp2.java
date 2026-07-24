// Student class
class Student {
    int id;
    String name;

    // Default constructor
    Student() {
        id = 1;
        name = "John";
    }

    // Parameterized constructor
    Student(int i, String n) {
        id = i;
        name = n;
    }

    // Copy constructor
    Student(Student s) {
        id = s.id;
        name = s.name;
    }

    // Display details
    void show() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

// Main class
public class Exp2 {
    public static void main(String[] args) {
        // Default constructor object
        Student s1 = new Student();

        // Parameterized constructor object
        Student s2 = new Student(10, "Tom");

        // Copy constructor object
        Student s3 = new Student(s2);

        System.out.println("Default Constructor:");
        s1.show();

        System.out.println("Parameterized Constructor:");
        s2.show();

        System.out.println("Copy Constructor:");
        s3.show();
    }
}