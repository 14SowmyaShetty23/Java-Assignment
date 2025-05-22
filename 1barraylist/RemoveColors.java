 //Q1b-2: Write a java program for getting different colors through ArrayList interface and remove the 2nd element and color "Blue" from the ArrayList

package Array_List_programs_1b;
import java.util.*;

public class RemoveColors {
 public static void main(String[] args) {
     ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

     System.out.println("Original List: " + colors);

     if (colors.size() > 1) {
         colors.remove(1); // Remove 2nd element (index 1)
     }
     colors.remove("Blue");

     System.out.println("Updated List: " + colors);
 }
}
