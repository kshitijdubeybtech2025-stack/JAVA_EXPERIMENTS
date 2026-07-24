import java.util.Scanner;
class FoodDelivery{
    String food="Pizza";
    int price=250;
    class OrderDetails{
        void display(){
            System.out.println("Food: "+food);
            System.out.println("Price: "+price);
        }
    }
    interface Delivery{
        void status();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        FoodDelivery f=new FoodDelivery();
        OrderDetails o=f.new OrderDetails();
        o.display();
        Delivery d=new Delivery(){
            public void status(){
                System.out.println("Order is out for delivery...");
            }
        };
        d.status();
    }
}
