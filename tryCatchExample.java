public class TryCatchExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        try {
            String str = null;
            System.out.println(str.length());
            int result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (NullpointerException e) {
            System.out.println("NullpointerException !!!");
            System.out.println("Exception message: " + e.getMessage());
        }
    }
}