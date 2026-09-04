import javax.swing.*;

public class Myframe {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Applications");

        JButton button = new JButton("Click Me");

        frame.add(button);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
