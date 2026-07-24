import java.util.Scanner;
class Vehicle{
    String brand="Honda";
    int year=2022;
    class Details{
        void display(){
            System.out.println("Brand: "+brand);
            System.out.println("Year: "+year);
        }
    }
    void mileage(double distance,double fuel){
        double result=distance/fuel;
        System.out.println("Mileage = "+result+" km/l");
    }
    interface Action{
        void drive();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Vehicle v=new Vehicle();
        Details d=v.new Details();
        d.display();
        Action a=new Action(){
            public void drive(){
                System.out.println("Vehicle is driving...");
            }
        };
        a.drive();
        System.out.print("Enter distance: ");
        double distance=sc.nextDouble();
        System.out.print("Enter fuel consumed: ");
        double fuel=sc.nextDouble();
        v.mileage(distance,fuel);
    }
}
