/*16.Is Map allows duplicate values?
Ans:YEs Map allows duplicate values

 */


import java.util.HashMap;
import java.util.Map;
public class Question16 {
    public static void main(String[] args) {
        Map<String, String> phonebook = new HashMap<>();

        // Adding key-value pairs with duplicate values
        phonebook.put("1234567890", "Alice");
        phonebook.put("9876543210", "Bob");
        phonebook.put("5551234567", "Alice"); // Same value as the first key

        // Attempting to add a duplicate key (overwrites value)
        phonebook.put("1234567890", "Charlie");

        System.out.println("Phonebook: " + phonebook);
        // Output: {1234567890=Charlie, 9876543210=Bob, 5551234567=Alice}

        // Retrieving values (duplicates are not an issue)
        String firstAliceNumber = phonebook.get("1234567890"); // Charlie
        String secondAliceNumber = phonebook.get("5551234567"); // Alice
        System.out.println("Alice's numbers: " + firstAliceNumber + ", " + secondAliceNumber);
    }
}




