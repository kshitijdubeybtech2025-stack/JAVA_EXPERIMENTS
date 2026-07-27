import java.util.ArrayList;
import java.util.Vector;

public class CollectionExample {
    public static void main(String[] args) {

        // Here, an ArrayList is created to store fruit names.
        // We add three fruits using the add() method and then
        // print the complete list on the screen.
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println("ArrayList: " + fruits);

        // A Vector is created to store integer values.
        // Just like ArrayList, we add elements using add()
        // and display all the stored numbers.
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Vector: " + numbers);

        // StringBuffer is used to create a string that can be modified.
        // The append() method adds " World" to "Hello",
        // and the final updated string is printed.
        StringBuffer message = new StringBuffer("Hello");
        message.append(" World");
        System.out.println("StringBuffer: " + message);
    }
}