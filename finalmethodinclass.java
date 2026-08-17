class Parent {
    void display() {
        System.out.println("This is a final method in the parent class.");
    }
}

class Child extends Parent {
    final void display() {
        System.out.println("This is a final method in the child class.");
    }
}

public class finalmethodinclass {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}