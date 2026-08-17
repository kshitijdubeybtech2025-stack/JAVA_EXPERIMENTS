abstract class shape{
    abstract void draw();

    void message(){
        System.out.println("This is an abstract class example.");
    }
}

class Circle extends shape{
    void draw(){
        System.out.println("Drawing a Circle.");
    }
}

public class abstractclass {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        c.message();
    }
}