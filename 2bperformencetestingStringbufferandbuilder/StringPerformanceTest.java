//Q2b: Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
//appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder.
//Justify your answer which one is better.

package StringPerformanceTest_2b;

public class StringPerformanceTest {
 public static void main(String[] args) {
     final int ITERATIONS = 10000;
     String text = "AIET";

     // StringBuilder Performance Test
     long startBuilder = System.nanoTime();
     StringBuilder sb = new StringBuilder();
     for (int i = 0; i < ITERATIONS; i++) {
         sb.append(text);
     }
     long endBuilder = System.nanoTime();
     long builderTime = endBuilder - startBuilder;

     // StringBuffer Performance Test
     long startBuffer = System.nanoTime();
     StringBuffer sbf = new StringBuffer();
     for (int i = 0; i < ITERATIONS; i++) {
         sbf.append(text);
     }
     long endBuffer = System.nanoTime();
     long bufferTime = endBuffer - startBuffer;

     // Output Results
     System.out.println("Time taken by StringBuilder: " + builderTime + " nanoseconds");
     System.out.println("Time taken by StringBuffer: " + bufferTime + " nanoseconds");

     // Justification
     if (builderTime < bufferTime) {
         System.out.println("StringBuilder is faster than StringBuffer (not synchronized, faster in single-threaded environments).");
     } else {
         System.out.println("StringBuffer is slower because it's thread-safe (synchronized), suitable for multithreaded applications.");
     }
 }
}
