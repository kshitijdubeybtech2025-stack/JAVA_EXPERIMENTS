class Food{
    String item="Burger";
    class Order{
        void show(){
            System.out.println("Food Item: "+item);
        }
    }
    void delivery(){
        System.out.println("Order is on the way");
    }
}
public class EX2{
    public static void main(String[] args){
        Food f=new Food();
        Food.Order o=f.new Order();
        o.show();
        Food d=new Food(){
            void delivery(){
                System.out.println("Order Delivered");
            }
        };
        d.delivery();
    }
}