//Q1c-4: Write a Java program to display elements and their positions in a linked list (using l_listobj.get(p))
package linked_List_Programs_1c;
import java.util.*;

public class LinkedListDisplayWithPosition {
 public static void main(String[] args) {
     LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Pink"));

     System.out.println("Elements with their positions:");
     for (int i = 0; i < list.size(); i++) {
         System.out.println("Position " + i + ": " + list.get(i));
     }
 }
}
