// 1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList
// and a LinkedList to perform the following operations with different functions directed as
// follows
// 1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.
// Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
// size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list
import java.util.*;

public class ListOperations1a{
    public static void main(String[] args) {
        // Step 1: Adding elements
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Step 2: Adding element at specific index
        arrayList.add(1, "Mango");
        linkedList.add(1, "Mango");

        // Step 3: Adding multiple elements
        List<String> moreFruits = Arrays.asList("Pineapple", "Grapes");
        arrayList.addAll(moreFruits);
        linkedList.addAll(moreFruits);

        // Step 4: Accessing elements
        System.out.println("ArrayList - Element at index 2: " + arrayList.get(2));
        System.out.println("LinkedList - Element at index 2: " + linkedList.get(2));

        // Step 5: Updating elements
        arrayList.set(2, "Peach");
        linkedList.set(2, "Peach");

        // Step 6: Removing elements
        arrayList.remove("Banana");
        linkedList.remove("Banana");

        // Step 7: Searching elements
        boolean hasAppleArray = arrayList.contains("Apple");
        boolean hasAppleLinked = linkedList.contains("Apple");
        System.out.println("ArrayList contains Apple: " + hasAppleArray);
        System.out.println("LinkedList contains Apple: " + hasAppleLinked);

        // Step 8: List size
        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("LinkedList size: " + linkedList.size());

        // Step 9: Iterating over list
        System.out.println("ArrayList iteration:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        System.out.println("LinkedList iteration:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // Step 10: Using Iterator
        System.out.println("ArrayList using Iterator:");
        Iterator<String> iteratorArray = arrayList.iterator();
        while (iteratorArray.hasNext()) {
            System.out.println(iteratorArray.next());
        }

        System.out.println("LinkedList using Iterator:");
        Iterator<String> iteratorLinked = linkedList.iterator();
        while (iteratorLinked.hasNext()) {
            System.out.println(iteratorLinked.next());
        }

        // Step 11: Sorting
        Collections.sort(arrayList);
        Collections.sort(linkedList);
        System.out.println("Sorted ArrayList: " + arrayList);
        System.out.println("Sorted LinkedList: " + linkedList);

        // Step 12: Sublist
        List<String> arraySubList = arrayList.subList(1, 3);
        List<String> linkedSubList = linkedList.subList(1, 3);
        System.out.println("ArrayList Sublist (1-3): " + arraySubList);
        System.out.println("LinkedList Sublist (1-3): " + linkedSubList);

        // Step 13: Clearing the list
        arrayList.clear();
        linkedList.clear();
        System.out.println("ArrayList after clear: " + arrayList);
        System.out.println("LinkedList after clear: " + linkedList);
    }
}
