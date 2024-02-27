/*28.When should we use the HashMap class?
Ans:

Here's when to use the HashMap class with an example program:

When to Use HashMap:

Storing key-value pairs: HashMap is designed for associating unique keys with values,
allowing efficient retrieval of values based on their keys.

Fast lookups by key: HashMap excels at retrieving values based on their keys
 with average O(1) time complexity, making it ideal for frequent key-based access.

Order of elements doesn't matter: HashMap doesn't guarantee any particular order of elements.
 If order is crucial, consider LinkedHashMap.
 */



import java.util.HashMap;
public class Question28 {

        public static void main(String[] args) {
            HashMap<String, String> phonebook = new HashMap<>();

            phonebook.put("Alice", "123-456-7890");
            phonebook.put("Bob", "987-654-3210");
            phonebook.put("Charlie", "555-1212");

            // Retrieving a phone number by name
            String aliceNumber = phonebook.get("Alice");
            System.out.println("Alice's number: " + aliceNumber);

            // Checking if a key exists
            boolean hasEmily = phonebook.containsKey("Emily");
            System.out.println("Has Emily? " + hasEmily);
        }
    }


