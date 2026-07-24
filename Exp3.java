// Student class
class Student {
    static String school = "ABC School";
    int id;
    String name;

    // Constructor
    Student(int i, String n) {
        id = i;
        name = n;
    }

    // Method overloading
    void show() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    void show(String msg) {
        System.out.println(msg);
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    // Static method
    static void showSchool() {
        System.out.println("School Name: " + school);
    }
}

// Main class
public class Exp3{
    public static void main(String[] args) {

        // Creating objects
        Student s1 = new Student(1, "Tom");
        Student s2 = new Student(2, "Jerry");

        // Calling overloaded methods
        s1.show();
        s2.show("Student Details:");

        // Calling static method
        Student.showSchool();
    }
}