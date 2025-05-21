//Q1c-5: Write a Java program that swaps two elements (first and third elements) in a linked list (using Collections.swap(l_list, 0, 2))

package linked_List_Programs_1c;
import java.util.*;

public class LinkedListSwapElements {
 public static void main(String[] args) {
     LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

     System.out.println("Before Swap: " + list);

     Collections.swap(list, 0, 2); // Swap 1st and 3rd elements

     System.out.println("After Swap (1st and 3rd): " + list);
 }
}

