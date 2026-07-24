// Restaurant class
class Restaurant {
    static int totalOrders = 0;

    // Dine-in bill
    double bill(double food) {
        totalOrders++;
        return food;
    }

    // Takeaway bill
    double bill(double food, double packing) {
        totalOrders++;
        return food + packing;
    }

    // Delivery bill
    double bill(double food, double delivery, double packing) {
        totalOrders++;
        return food + delivery + packing;
    }

    // Show total orders
    static void showOrders() {
        System.out.println("Total Orders: " + totalOrders);
    }
}

public class RestOrder {
    public static void main(String[] args) {
        Restaurant r = new Restaurant();

        // Dine-in order
        System.out.println("Dine-in Bill: " + r.bill(500));

        // Takeaway order
        System.out.println("Takeaway Bill: " + r.bill(500, 50));

        // Delivery order
        System.out.println("Delivery Bill: " + r.bill(500, 100, 50));

        Restaurant.showOrders();
    }
}