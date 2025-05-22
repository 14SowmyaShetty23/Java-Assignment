//Q3c.8. Write a Java Program for Verifying if a string contains only numeric characters using user defined function isNumeric()

package string_Exercise_progams_3c;

public class NumericCheck {
 public static boolean isNumeric(String str) {
     return str != null && str.matches("\\d+");
 }

 public static void main(String[] args) {
     String test1 = "123456";
     String test2 = "abc123";
     System.out.println(test1 + " is numeric? " + isNumeric(test1));
     System.out.println(test2 + " is numeric? " + isNumeric(test2));
 }
}
