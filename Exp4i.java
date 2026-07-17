public class Exp4i {
    public static void main(String[] args) {
        String[] marks = {"85", "90", "78", "92", "88"};
        int total = 0;
        for (String mark : marks) {
            int value = Integer.parseInt(mark);
            total = total + value;
        }
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + (total / marks.length));
    }
}
