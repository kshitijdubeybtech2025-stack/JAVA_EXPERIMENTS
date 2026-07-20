import java.util.ArrayList;

public class Exp5i {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("Buy groceries");
        tasks.add("Do homework");
        tasks.add("Clean room");
        StringBuffer sb = new StringBuffer();
        sb.append("---- My To-Do List ----\n");
        for (int i = 0; i < tasks.size(); i++) {
            sb.append((i + 1) + ". " + tasks.get(i) + "\n");
        }
        System.out.println(sb);
    }
}
