//Q3b-5: Write a Java Program for Eliminating all whitespace characters from a string using user-defined function removeWhitespace()

package string_Exercise_progams_3b;
public class RemoveWhitespace {
 public static String removeWhitespace(String input) {
     return input.replaceAll("\\s", "");
 }

 public static void main(String[] args) {
     String original = " J a v a   P r o g r a m ";
     String noSpaces = removeWhitespace(original);

     System.out.println("Original: '" + original + "'");
     System.out.println("Without Whitespace: '" + noSpaces + "'");
 }
}
