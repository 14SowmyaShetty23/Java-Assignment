//Q5a. Add countries to JList and display selected on console

package countryListDisplay_5a;

import javax.swing.*;

public class CountryListDisplay {
 public static void main(String[] args) {
     JFrame frame = new JFrame("Country List");

     String[] countries = {"USA", "India", "Vietnam", "Canada", "Denmark", "France", "Great Britain",
             "Japan", "Africa", "Greenland", "Singapore"};

     JList<String> countryList = new JList<>(countries);
     JScrollPane scroll = new JScrollPane(countryList);
     scroll.setBounds(50, 50, 200, 150);

     countryList.addListSelectionListener(e -> {
         if (!e.getValueIsAdjusting()) {
             for (String selected : countryList.getSelectedValuesList())
                 System.out.println("Selected: " + selected);
         }
     });

     frame.add(scroll);
     frame.setSize(320, 300);
     frame.setLayout(null);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setVisible(true);
 }
}
