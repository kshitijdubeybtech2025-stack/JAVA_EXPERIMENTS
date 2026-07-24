// Student class
class Student {
    String m1 = "80";
    String m2 = "90";
    String m3 = "70";
    // Calculate total marks
    void totalMarks() {
        Integer mark1 = Integer.valueOf(m1);
        Integer mark2 = Integer.valueOf(m2);
        Integer mark3 = Integer.valueOf(m3);

        int total = mark1 + mark2 + mark3;

        System.out.println("Total Marks: " + total);
    }
}
public class Exp4P1 {
    public static void main(String[] args) {
        Student s = new Student();

        // Show total
        s.totalMarks();
    }
}