//Q4c. Show message when image buttons (Digital Clock / Hour Glass) are pressed using addActionListener()

package imageButton_4c;

import javax.swing.*;

public class imageButton {
 public static void main(String[] args) {
     JFrame frame = new JFrame("Image Button");

     // Provide full absolute paths for your images
     ImageIcon clockIcon = new ImageIcon("C:/Users/shodh/OneDrive/Desktop/Clock.png");
     ImageIcon hourglassIcon = new ImageIcon("C:/Users/shodh/OneDrive/Desktop/Hourglass.png");

     JButton btnClock = new JButton("Digital Clock", clockIcon);
     JButton btnHourglass = new JButton("Hour Glass", hourglassIcon);
     JLabel label = new JLabel("", SwingConstants.CENTER);

     btnClock.setBounds(200, 100, 220, 80);
     btnHourglass.setBounds(290, 100, 220, 80);
     label.setBounds(50, 200, 500, 30);

     btnClock.addActionListener(e -> label.setText("Digital Clock is pressed"));
     btnHourglass.addActionListener(e -> label.setText("Hour Glass is pressed"));

     frame.add(btnClock);
     frame.add(btnHourglass);
     frame.add(label);

     frame.setSize(600, 600);
     frame.setLayout(null);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setVisible(true);
 }
}
