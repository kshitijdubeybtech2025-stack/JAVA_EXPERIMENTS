import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();

        Integer str1 = Integer.valueOf(num1);
        Integer str2 = Integer.valueOf(num2);

        int a = str1;
        int b = str2;

        int sum = a + b;
        Integer result = Integer.valueOf(sum);

        int x = 10;
        int y = 20;

        Integer wrappedX = Integer.valueOf(x);
        Integer wrappedY = Integer.valueOf(y);

        int wrappedSum = wrappedX + wrappedY;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("Sum: " + result);
        System.out.println("x: " + wrappedX);
        System.out.println("y: " + wrappedY);
        System.out.println("Wrapped Sum: " + wrappedsum);

        scanner.close();
    }
}