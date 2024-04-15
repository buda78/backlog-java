import java.awt.*;
import javax.swing.*;
public class Border
{
JFrame f;
Border()
{
f = new JFrame();

JButton b1 = new JButton("NORTH");; 
NORTH
JButton b2 = new JButton("SOUTH");; 
SOUTH
JButton b3 = new JButton("EAST");; 
EAST
JButton b4 = new JButton("WEST");; 
WEST
JButton b5 = new JButton("CENTER");;
CENTER
f.add(b1, BorderLayout.NORTH); 
Directionf.add(b2, BorderLayout.SOUTH);
Direction
f.add(b3, BorderLayout.EAST); 
Direction
f.add(b4, BorderLayout.WEST); 
Direction
f.add(b5, BorderLayout.CENTER); 
f.setSize(300, 300);
f.setVisible(true);
}
public static void main(String[] args) {
new Border();
}
}
