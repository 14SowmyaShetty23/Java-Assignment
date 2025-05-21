//Q3b-2: Write a Java Program for Counting how many times a substring appears in a main string using user-defined function countOccurrences()

package string_Exercise_progams_3b;

public class CountOccurrences {
 public static int countOccurrences(String main, String sub) {
     int count = 0;
     int index = 0;
     while ((index = main.indexOf(sub, index)) != -1) {
         count++;
         index += sub.length();
     }
     return count;
 }

 public static void main(String[] args) {
     String mainStr = "AIET is the best. AIET offers quality education. AIET!";
     String subStr = "AIET";

     int result = countOccurrences(mainStr, subStr);
     System.out.println("Occurrences of '" + subStr + "': " + result);
 }
}
