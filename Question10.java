/*10.Is Set allows duplicate elements?
Ans:
No, sets in Java do not allow duplicate elements.
This is a fundamental property of the Set interface,
ensuring that each element within a set is unique.

 */

import java.util.HashSet;
import java.util.Set;

    public class Question10 {
        public static void main(String[] args) {
            // Create a HashSet (implementation of Set interface)
            Set<String> uniqueNames = new HashSet<>();

            // Add elements to the set (duplicates are ignored)
            uniqueNames.add("Alice");
            uniqueNames.add("Bob");
            uniqueNames.add("Alice"); // Duplicate ignored

            System.out.println(uniqueNames); // Prints: [Alice, Bob]
        }
    }





