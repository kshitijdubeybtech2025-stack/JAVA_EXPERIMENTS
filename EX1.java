import java.util.Scanner;

class Vehicle{
    String name="Car";
    int petrol;
    int distance;
    int mileage;
    class Details{
        void show(){
            System.out.println(name);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the distance(km): ");
            distance = scanner.nextInt();
            System.out.print("Enter the petrol used(lit): ");
            petrol = scanner.nextInt();
            mileage = distance / petrol;
            System.out.println(mileage);
        }
    }
    void drive(){
        System.out.println("Vehicle is moving");
    }
}
public class EX1{
    public static void main(String[] args){
        Vehicle v = new Vehicle();
        Vehicle.Details d = v.new Details();
        d.show();

        Vehicle a = new Vehicle(){
            void drive(){
                System.out.println("Vehicle Started");
            }
        };

        a.drive();
    }
}