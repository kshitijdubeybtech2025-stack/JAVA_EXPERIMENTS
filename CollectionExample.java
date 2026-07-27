import java.util.ArrayList;
import java.util.Vector;

public class CollectionExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println("ArrayList:");
        System.out.println(fruits);

        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Vector:");
        System.out.println(numbers);

        StringBuffer message = new StringBuffer("Hello");
        message.append(" World");
        System.out.println("StringBuffer:");
        System.out.println(message);
    }
}