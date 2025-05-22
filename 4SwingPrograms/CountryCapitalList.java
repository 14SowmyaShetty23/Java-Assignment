//Q5c. Display capital of selected country from JList on console

package countryCapitalList_5c;

import javax.swing.*;
import java.util.*;

public class CountryCapitalList {
 public static void main(String[] args) {
     JFrame frame = new JFrame("Country Capitals");

     String[] countries = {"USA", "India", "Vietnam", "Canada", "Denmark", "France", "Great Britain",
             "Japan", "Africa", "Greenland", "Singapore"};

     Map<String, String> capitals = new HashMap<>();
     capitals.put("USA", "Washington, D.C.");
     capitals.put("India", "New Delhi");
     capitals.put("Vietnam", "Hanoi");
     capitals.put("Canada", "Ottawa");
     capitals.put("Denmark", "Copenhagen");
     capitals.put("France", "Paris");
     capitals.put("Great Britain", "London");
     capitals.put("Japan", "Tokyo");
     capitals.put("Africa", "Addis Ababa");
     capitals.put("Greenland", "Nuuk");
     capitals.put("Singapore", "Singapore");

     JList<String> countryList = new JList<>(countries);
     JScrollPane scroll = new JScrollPane(countryList);
     scroll.setBounds(50, 50, 200, 150);

     countryList.addListSelectionListener(e -> {
         if (!e.getValueIsAdjusting()) {
             for (String selected : countryList.getSelectedValuesList())
                 System.out.println("Capital of " + selected + " is " + capitals.get(selected));
         }
     });

     frame.add(scroll);
     frame.setSize(320, 300);
     frame.setLayout(null);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setVisible(true);
 }
}
