//Q1c-3: Write a Java program to insert the specified element at the end of a linked list (using l_listobj.offerLast("Pink"))
package linked_List_Programs_1c;
import java.util.*;

public class LinkedListInsertEnd {
 public static void main(String[] args) {
     LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue"));

     System.out.println("Before Inserting: " + list);

     list.offerLast("Pink");

     System.out.println("After Inserting 'Pink' at the end: " + list);
 }
}
