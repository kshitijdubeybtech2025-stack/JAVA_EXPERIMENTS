// Student class
class Student {
    String m1 = "80";
    String m2 = "90";
    String m3 = "70";
    // Calculate total marks
    void totalMarks() {
        int total = Integer.parseInt(m1) + Integer.parseInt(m2) + Integer.parseInt(m3);
        System.out.println("Total Marks: " + total);
    }
}
public class Exp4P1 {
    public static void main(String[] args) {
        Student s = new Student();
        // Convert and calculate marks
        s.totalMarks();
    }
}