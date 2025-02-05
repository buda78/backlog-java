import javax.swing.*;
import java.awt.*;
public class BorderLayoutExample {
public static void main(String[] args) {
JFrame frame = new JFrame("BorderLayout Example");
frame.setSize(400, 300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JButton btnNorth = new JButton("North");
JButton btnSouth = new JButton("South");
JButton btnEast = new JButton("East");
JButton btnWest = new JButton("West");
JButton btnCenter = new JButton("Center");
frame.setLayout(new BorderLayout());
frame.add(btnNorth, BorderLayout.NORTH);
frame.add(btnSouth, BorderLayout.SOUTH);
frame.add(btnEast, BorderLayout.EAST);
frame.add(btnWest, BorderLayout.WEST);
frame.add(btnCenter, BorderLayout.CENTER);
frame.setVisible(true);
}
}
