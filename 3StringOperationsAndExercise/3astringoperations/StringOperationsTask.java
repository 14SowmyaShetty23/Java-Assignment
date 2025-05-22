//Q3a: Develop a java program for performing various string operations with different string handling functions:
//String Creation and Basic Operations, Length and Character Access, String Comparison, String Searching,
//Substring Operations, String Modification, Whitespace Handling, String Concatenation, String Splitting,
//StringBuilder Demo, String Formatting, Validate Email with contains(), startsWith(), and endsWith()

package StringOperationsTask_3a;

public class StringOperationsTask {
 public static void main(String[] args) {
     // String Creation
     String str1 = "  Welcome to Java Programming  ";
     String str2 = "welcome to java programming";

     System.out.println("Original String: '" + str1 + "'");

     // Length and Character Access
     System.out.println("Length: " + str1.length());
     System.out.println("Character at index 5: " + str1.charAt(5));

     // String Comparison
     System.out.println("Equals (case-sensitive): " + str1.equals(str2));
     System.out.println("EqualsIgnoreCase: " + str1.equalsIgnoreCase(str2));

     // String Searching
     System.out.println("Contains 'Java': " + str1.contains("Java"));
     System.out.println("Index of 'Programming': " + str1.indexOf("Programming"));

     // Substring Operations
     System.out.println("Substring (11 to 15): " + str1.substring(11, 15));

     // String Modification
     String modified = str1.replace("Java", "String");
     System.out.println("Modified String: " + modified);

     // Whitespace Handling
     System.out.println("Trimmed String: '" + str1.trim() + "'");

     // String Concatenation
     String concatenated = "Note: " + str1.trim();
     System.out.println("Concatenated String: " + concatenated);

     // String Splitting
     String[] words = str1.trim().split(" ");
     System.out.println("Split words:");
     for (String word : words) {
         System.out.println(word);
     }

     // StringBuilder Demo
     StringBuilder sb = new StringBuilder("Java");
     sb.append(" Programming");
     sb.insert(0, "Advanced ");
     sb.replace(0, 8, "Core");
     System.out.println("StringBuilder Result: " + sb.toString());

     // String Formatting
     String name = "David";
     int id = 101;
     String formatted = String.format("Student: %s | ID: %d", name, id);
     System.out.println("Formatted String: " + formatted);

     // Email Validation
     String email = "student@example.com";
     boolean isValid = email.contains("@") && email.startsWith("student") && email.endsWith(".com");
     System.out.println("Email: " + email);
     System.out.println("Is email valid? " + isValid);
 }
}
