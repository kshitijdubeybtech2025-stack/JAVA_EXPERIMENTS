public class Exp2ii {
    int id, price;
    String company;
    Inventory(){
        id = 1000;
        company = "Unknown";
        price = 0;
    }
    Inventory(int id, String company, int price){
        this.id = id;
        this.company = company;
        this.price = price;
    }
    Inventory(Inventory a){
        this.id = a.id;
        this.company = a.company;
        this.price = a.price;
    }
    void show(){
        System.out.println("ID: "+id);
        System.out.println("Company: "+company);
        System.out.println("Price: "+price);
        System.out.println();
    }
    public static void main (String[] args) throws Exception{
        Inventory mob1 = new Inventory(1001, "Samsung", 10000);
        Inventory mob2 = new Inventory(1002, "Apple", 50000);
        Inventory mob3 = new Inventory(mob1);
        Inventory mob4 = new Inventory();
        mob1.show();
        mob2.show();
        mob3.show();
        mob4.show();
    }
}
