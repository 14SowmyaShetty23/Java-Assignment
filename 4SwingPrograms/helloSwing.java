//Q4a. Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing 
//Programming in Blue color plain font with font size of 32 using JFrame and JLabel

package HelloSwing_4a;

import javax.swing.*;
import java.awt.*;

public class helloSwing {
 public static void main(String[] args) {
     // Create JFrame
     JFrame frame = new JFrame("Swing Hello");

     // Create JLabel with text
     JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming", SwingConstants.CENTER);

     // Set font style and size
     label.setFont(new Font("Arial", Font.PLAIN, 32));

     // Set text color to blue
     label.setForeground(Color.BLUE);

     // Add label to frame
     frame.add(label);

     // Set frame size
     frame.setSize(800, 200);

     // Set default close operation
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     // Center the frame
     frame.setLocationRelativeTo(null);

     // Make frame visible
     frame.setVisible(true);
 }
}
