//Q3c.9. Write a Java Program for Creating a random string of a specified length using user defined function generateRandomString()

package string_Exercise_progams_3c;
import java.util.Random;
public class RandomStringGenerator {
 public static String generateRandomString(int length) {
     String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
     Random rand = new Random();
     StringBuilder sb = new StringBuilder(length);
     for (int i = 0; i < length; i++)
         sb.append(chars.charAt(rand.nextInt(chars.length())));
     return sb.toString();
 }

 public static void main(String[] args) {
     int length = 10;
     System.out.println("Random String: " + generateRandomString(length));
 }
}
