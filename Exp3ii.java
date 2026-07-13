public class Exp3ii {
    static int totalOrders = 0;
    double calculateBill(double food, int tableNumber) {
        double total = food + (food * 0.05);
        totalOrders++;
        System.out.println("Dine-in order for Table " + tableNumber);
        return total;
    }
    double calculateBill(double food, boolean takeaway) {
        double total = food + (food * 0.05);
        if (takeaway) {
            total = total + 20;
        }
        totalOrders++;
        System.out.println("Takeaway order");
        return total;
    }
    double calculateBill(double food, String address) {
        double total = food + (food * 0.05) + 50;
        totalOrders++;
        System.out.println("Delivery order to " + address);
        return total;
    }
    public static void main(String[] args) {
        RestaurantBilling billing = new RestaurantBilling();
        double bill1 = billing.calculateBill(500, 4);
        System.out.println("Bill: " + bill1);
        double bill2 = billing.calculateBill(300, true);
        System.out.println("Bill: " + bill2);
        double bill3 = billing.calculateBill(400, "Pune City");
        System.out.println("Bill: " + bill3);
        System.out.println("Total Orders: " + totalOrders);
    }
}
