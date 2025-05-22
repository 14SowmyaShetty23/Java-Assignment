//Q5d. Tabbed Pan of Cyan, Magenta, and Yellow

package ColorTabsCMY_5d;

import javax.swing.*;
import java.awt.*;

public class colorTabsCMY {
 public static void main(String[] args) {
     JFrame frame = new JFrame("CMY Tabs");
     JTabbedPane tabbedPane = new JTabbedPane();

     JPanel cyanPanel = new JPanel();
     cyanPanel.setBackground(Color.CYAN);
     tabbedPane.add("Cyan", cyanPanel);

     JPanel magentaPanel = new JPanel();
     magentaPanel.setBackground(Color.MAGENTA);
     tabbedPane.add("Magenta", magentaPanel);

     JPanel yellowPanel = new JPanel();
     yellowPanel.setBackground(Color.YELLOW);
     tabbedPane.add("Yellow", yellowPanel);

     frame.add(tabbedPane);
     frame.setSize(400, 300);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setVisible(true);
 }
}
