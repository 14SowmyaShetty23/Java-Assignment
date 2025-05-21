package Array_List_programs_1b;

//Q1b-5: Write a java program for getting different colors through ArrayList interface and delete nth element from the ArrayList object by using remove by index

import java.util.*;

public class DeleteNthElement {
 public static void main(String[] args) {
     ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

     int n = 2; // Remove the 3rd element (index 2)

     System.out.println("Original List: " + colors);

     if (n < colors.size()) {
         colors.remove(n);
         System.out.println("After removing element at index " + n + ": " + colors);
     } else {
         System.out.println("Index out of bounds.");
     }
 }
}
