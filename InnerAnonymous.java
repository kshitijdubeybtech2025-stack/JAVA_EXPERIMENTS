class Outer {
    private String message = "Hello Bob";

    class Inner {
        void display() {
            System.out.println("Message: " + message);
        }
    }
}
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
public class InnerAnonymous {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();
        Animal a = new Animal();
        a.sound();
    }
}