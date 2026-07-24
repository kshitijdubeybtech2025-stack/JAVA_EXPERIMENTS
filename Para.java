class Student {
    String name;
    int age;
    double height;
    double weight;
    int roll;

    Student(String name, int age, double height, double weight, int roll) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.roll = roll;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " m");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Roll Number: " + roll);
    }
}
class Para {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20, 1.83, 80.5, 6578962);
        Student s2 = new Student("Max", 87, 1.93, 90.5, 6578923);
        
        s1.show();
        s2.show();
    }
}