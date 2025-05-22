//Q3b-4: Write a Java Program for Checking if a string reads the same backward as forward (ignoring case and punctuation) using user-defined function isPalindrome()

package string_Exercise_progams_3b;

public class IsPalindrome {
 public static boolean isPalindrome(String input) {
     if (input == null) return false;

     String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
     String reversed = new StringBuilder(cleaned).reverse().toString();

     return cleaned.equals(reversed);
 }

 public static void main(String[] args) {
     String test = "Madam, in Eden, I’m Adam";

     boolean result = isPalindrome(test);
     System.out.println("Input: " + test);
     System.out.println("Is Palindrome? " + result);
 }
}
