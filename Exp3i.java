public class Exp3i {
    static int calculationCount = 0;
    int add(int a, int b) {
        calculationCount++;
        return a + b;
    }
    int add(int a, int b, int c) {
        calculationCount++;
        return a + b + c;
    }
    double add(double a, double b) {
        calculationCount++;
        return a + b;
    }
    double add(double a, double b, double c) {
        calculationCount++;
        return a + b + c;
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum1 = calc.add(5, 10);
        System.out.println("Sum of two integers: " + sum1);
        int sum2 = calc.add(5, 10, 15);
        System.out.println("Sum of three integers: " + sum2);
        double sum3 = calc.add(5.5, 10.2);
        System.out.println("Sum of two decimals: " + sum3);
        double sum4 = calc.add(5.5, 10.2, 3.3);
        System.out.println("Sum of three decimals: " + sum4);
        System.out.println("Total calculations performed: " + Calculator.calculationCount);
    }
}




