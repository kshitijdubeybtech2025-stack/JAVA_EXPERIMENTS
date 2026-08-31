class DivisionByZeroException extends RuntimeException {
    public DivisionByZeroException(String s) {
        super(s);
    }
}
public class DP {
    public static void divide(int a, int b) {
        if (b == 0) {
            throw new DivisionByZeroException(
                    "Division by zero is not allowed!");
        }
        System.out.println("Result: " + (a / b));
    }   
    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (DivisionByZeroException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
    }
}