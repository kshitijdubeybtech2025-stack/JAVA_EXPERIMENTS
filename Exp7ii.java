class Product{
    String name;
    double price;
    Product(String name,double price){
        this.name=name;
        this.price=price;
    }
    public static void main(String[] args){
        ProductInfo e=new Electronic("Laptop",50000);
        ProductInfo c=new Clothing("T-Shirt",800);
        ProductInfo g=new Grocery("Rice",600);
        e.display();
        c.display();
        g.display();
    }
}
interface ProductInfo{
    void display();
}
class Electronic extends Product implements ProductInfo{
    Electronic(String name,double price){
        super(name,price);
    }
    public void display(){
        System.out.println("Electronic: "+name+" Price: "+price);
    }
}
class Clothing extends Product implements ProductInfo{
    Clothing(String name,double price){
        super(name,price);
    }
    public void display(){
        System.out.println("Clothing: "+name+" Price: "+price);
    }
}
class Grocery extends Product implements ProductInfo{
    Grocery(String name,double price){
        super(name,price);
    }
    public void display(){
        System.out.println("Grocery: "+name+" Price: "+price);
    }
}
