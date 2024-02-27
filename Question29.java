/*29.When should we use the LinkedHashMap class?
Ans:

Here's when to use the LinkedHashMap class with an example program:

When to Use LinkedHashMap:

Storing key-value pairs while preserving insertion order: LinkedHashMap
offers the fast lookup capabilities of a HashMap while maintaining the order in which key-value pairs
were added.

Need for both efficient retrieval and order: When you want quick access to values by key but also
need to track the sequence of entries, LinkedHashMap is the ideal choice.

Accessing elements in insertion order: Iteration through a LinkedHashMap returns key-value pairs
in the same order they were inserted.
 */

import java.util.*;
public class Question29 {

        public static void main(String[] args) {
            LinkedHashMap<String, String> recentSearches = new LinkedHashMap<>(16, 0.75f, true); // Access order

            recentSearches.put("Java", "https://www.java.com");
            recentSearches.put("Python", "https://www.python.org");
            recentSearches.put("JavaScript", "https://www.javascript.com");

            // Access "Java" before iteration
            recentSearches.get("Java"); // Mark "Java" as accessed

            System.out.println("Recent searches in access order:");

            // Create a separate list to store the keys for iteration
            // This avoids concurrent modification issues
            ArrayList<String> keys = new ArrayList<>(recentSearches.keySet());

            for (String search : keys) {
                System.out.println(search + " -> " + recentSearches.get(search));
            }
        }
    }





