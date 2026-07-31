class Animal {
    void dis() {
        System.out.println("In animal class");
    }
}
public class anonymous {
    public static void main(String[] args) {
        Animal a = new Animal() {
            void dis() {
                System.out.println("In anonymous class");
            }
        };
        System.out.println("Hello from anonymous class");
        a.dis();
    }
}