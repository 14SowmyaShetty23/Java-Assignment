//Q1c-2: Write a Java program to iterate a linked list in reverse order (using objlist.descendingIterator())
package linked_List_Programs_1c;
import java.util.*;

public class LinkedListReverseIterate {
 public static void main(String[] args) {
     LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Pink"));

     System.out.println("Original List: " + list);

     Iterator<String> reverseIterator = list.descendingIterator();
     System.out.println("Reverse Iteration:");
     while (reverseIterator.hasNext()) {
         System.out.println(reverseIterator.next());
     }
 }
}
