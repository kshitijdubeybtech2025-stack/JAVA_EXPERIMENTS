class Vehicle{
    String name="Car";

    class Details{
        void show(){
            System.out.println(name);
        }
    }
    void drive(){
        System.out.println("Vehicle is moving");
    }
}
public class EX1{
    public static void main(String[] args){
        Vehicle v=new Vehicle();
        Vehicle.Details d=v.new Details();
        d.show();

        Vehicle a=new Vehicle(){
            void drive(){
                System.out.println("Vehicle Started");
            }
        };
        a.drive();
    }
}