import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Buttondemo extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    Buttondemo() {
        label = new JLabel("Click the button");
        button = new JButton("Click Me");
        button.addActionListener(this);
        setLayout(new FlowLayout());
        add(label);
        add(button);
        setTitle("Button Demo");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("Button Clicked!");
    }
    public static void main(String[] args) {
        new Buttondemo();
    }
}
