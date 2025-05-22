//Q3c.7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user defined function truncate()

package string_Exercise_progams_3c;

public class TruncateString {
 public static String truncate(String str, int maxLength) {
     if (str == null || str.length() <= maxLength) return str;
     return str.substring(0, maxLength) + "...";
 }

 public static void main(String[] args) {
     String input = "Artificial Intelligence is powerful.";
     int limit = 20;
     System.out.println("Original: " + input);
     System.out.println("Truncated: " + truncate(input, limit));
 }
}
