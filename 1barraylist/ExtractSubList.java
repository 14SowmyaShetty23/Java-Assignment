//Q1b-4: Write a java program for getting different colors through ArrayList interface and extract the elements 1st and 2nd from the ArrayList object by using subList()

package Array_List_programs_1b;
import java.util.*;

public class ExtractSubList {
 public static void main(String[] args) {
     ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

     System.out.println("Original List: " + colors);

     List<String> subColors = colors.subList(0, 2); // Extract 1st and 2nd

     System.out.println("Extracted Sublist: " + subColors);
 }
}
