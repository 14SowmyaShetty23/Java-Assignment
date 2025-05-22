//Q4b. Display “Srilanka is pressed” or “India is pressed” based on button click using addActionListener()

package countryButton_4b;

import javax.swing.*;

public class CountryButton {
 public static void main(String[] args) {
     JFrame frame = new JFrame("Country Button");
     JButton btnSri = new JButton("Srilanka");
     JButton btnIndia = new JButton("India");
     JLabel label = new JLabel("", SwingConstants.CENTER);

     btnSri.setBounds(100, 100, 120, 40);
     btnIndia.setBounds(230, 100, 120, 40);
     label.setBounds(50, 170, 300, 30);

     btnSri.addActionListener(e -> label.setText("Srilanka is pressed"));
     btnIndia.addActionListener(e -> label.setText("India is pressed"));

     frame.add(btnSri);
     frame.add(btnIndia);
     frame.add(label);

     frame.setSize(450, 300);
     frame.setLayout(null);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setVisible(true);
 }
}
