// Calculator class
class Calculator {
    static int count = 0;

    // Add integers
    int add(int a, int b) {
        count++;
        return a + b;
    }

    // Add decimals
    double add(double a, double b) {
        count++;
        return a + b;
    }

    // Show count
    static void showCount() {
        System.out.println("Calculations: " + count);
    }
}

public class Calculator {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        // Integer addition
        System.out.println("Sum: " + c.add(5, 10));

        // Decimal addition
        System.out.println("Sum: " + c.add(2.5, 3.5));

        Calculator.showCount();
    }
}