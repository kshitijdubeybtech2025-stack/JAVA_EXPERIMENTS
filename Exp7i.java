import java.util.Scanner;
class Shape{
    double area(){
        return 0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r=sc.nextDouble();
        System.out.print("Enter length: ");
        double l=sc.nextDouble();
        System.out.print("Enter width: ");
        double w=sc.nextDouble();
        Shape c=new Circle(r);
        Shape rec=new Rectangle(l,w);
        System.out.println("Circle area = "+c.area());
        System.out.println("Rectangle area = "+rec.area());
    }
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    double area(){
        return 3.14*radius*radius;
    }
}
class Rectangle extends Shape{
    double length,width;
    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    double area(){
        return length*width;
    }
}
