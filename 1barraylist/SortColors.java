 //Q1b-3: Write a java program for getting different colors through ArrayList interface and sort them using Collections.sort( ArrayListObj)


package Array_List_programs_1b;
import java.util.*;

public class SortColors {
 public static void main(String[] args) {
     ArrayList<String> colors = new ArrayList<>(Arrays.asList("Yellow", "Red", "Green", "Blue"));

     System.out.println("Before Sorting: " + colors);

     Collections.sort(colors);

     System.out.println("After Sorting: " + colors);
 }
}
