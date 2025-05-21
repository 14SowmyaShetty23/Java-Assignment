//Q1c-1: Write a Java program to iterate through all elements in a linked list starting at the specified position (2nd) using iterator

package linked_List_Programs_1c;
import java.util.*;

public class LinkedListIterateFromSecond {
 public static void main(String[] args) {
     LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow", "Pink"));

     System.out.println("Original List: " + list);

     Iterator<String> iterator = list.listIterator(1); // Start from index 1 (2nd element)
     System.out.println("Iterating from 2nd element:");
     while (iterator.hasNext()) {
         System.out.println(iterator.next());
     }
 }
}
