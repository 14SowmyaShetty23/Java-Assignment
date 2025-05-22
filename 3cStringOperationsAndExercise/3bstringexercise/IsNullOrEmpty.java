//Q3b-1: Write a Java Program for Checking if a given string is null or contains only whitespace using user-defined function isNullOrEmpty()

package string_Exercise_progams_3b;

public class IsNullOrEmpty {
 public static boolean isNullOrEmpty(String input) {
     return input == null || input.trim().isEmpty();
 }

 public static void main(String[] args) {
     String test1 = null;
     String test2 = "   ";
     String test3 = "Hello";

     System.out.println("Test1 " + test1 + ":"+ isNullOrEmpty(test1)); // true
     System.out.println("Test2 " + test2 +":"+ isNullOrEmpty(test2)); // true
     System.out.println("Test3 " + test3 + ":"+ isNullOrEmpty(test3)); // false
 }
}
