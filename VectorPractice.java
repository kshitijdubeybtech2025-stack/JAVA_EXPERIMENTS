import java.util.Vector;

public class VectorPractice {
    public static void main(String[] args) {

        Vector<Integer> numbers = new Vector<>();

        numbers.add(25);
        numbers.add(78);
        numbers.add(13);
        numbers.add(42);

        System.out.println("Original List: " + numbers);
        numbers.remove(2);
        System.out.println("After Removing Element at Index 2: " + numbers);
        System.out.println("Size: " + numbers.size());
        System.out.println("Contains 25: " + numbers.contains(25));
    }
}