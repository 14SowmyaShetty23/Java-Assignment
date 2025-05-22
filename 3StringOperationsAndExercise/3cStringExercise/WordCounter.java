//Q3c.10. Write a Java Program for Counting the number of words in a string using user defined function countWords()

package string_Exercise_progams_3c;

public class WordCounter {
 public static int countWords(String str) {
     if (str == null || str.trim().isEmpty()) return 0;
     return str.trim().split("\\s+").length;
 }

 public static void main(String[] args) {
     String sentence = "Java is a widely used programming language.";
     System.out.println("Sentence: " + sentence);
     System.out.println("Word Count: " + countWords(sentence));
 }
}
