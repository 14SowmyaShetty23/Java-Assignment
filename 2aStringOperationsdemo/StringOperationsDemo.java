//Q2a: Develop a java program for performing various string operations with different string handling functions:
//String Creation and Basic Operations, Length and Character Access, String Comparison, String Searching, 
//Substring Operations, String Modification, Whitespace Handling, String Concatenation, String Splitting, 
//StringBuilder Demo, String Formatting, Validate Email with contains(), startsWith(), and endsWith()

package StringOperationsDemo_2a;

public class StringOperationsDemo {
 public static void main(String[] args) {
     // String Creation
     String str1 = " Hello, Java World! ";
     String str2 = "hello, java world!";

     System.out.println("Original String: '" + str1 + "'");

     // Length and Character Access
     System.out.println("Length: " + str1.length());
     System.out.println("Character at index 7: " + str1.charAt(7));

     // String Comparison
     System.out.println("Equals (case-sensitive): " + str1.equals(str2));
     System.out.println("EqualsIgnoreCase: " + str1.equalsIgnoreCase(str2));

     // String Searching
     System.out.println("Contains 'Java': " + str1.contains("Java"));
     System.out.println("Index of 'World': " + str1.indexOf("World"));

     // Substring Operations
     System.out.println("Substring (7 to 11): " + str1.substring(7, 11));

     // String Modification
     String modified = str1.replace("Java", "String");
     System.out.println("Modified String: " + modified);

     // Whitespace Handling
     System.out.println("Trimmed String: '" + str1.trim() + "'");

     // String Concatenation
     String concatenated = "Welcome to" + str1.trim();
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
     sb.insert(0, "Welcome to ");
     sb.replace(11, 15, "the amazing");
     sb.delete(0, 11);
     System.out.println("StringBuilder Result: " + sb.toString());

     // String Formatting
     String name = "Alice";
     int age = 25;
     String formatted = String.format("Name: %s, Age: %d", name, age);
     System.out.println("Formatted String: " + formatted);

     // Validate Email with contains(), startsWith(), endsWith()
     String email = "user@example.com";
     boolean isValid = email.contains("@") && email.startsWith("user") && email.endsWith(".com");
     System.out.println("Email: " + email);
     System.out.println("Is email valid? " + isValid);
 }
}
