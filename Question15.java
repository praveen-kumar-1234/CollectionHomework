/*15.Is Map allows duplicate keys?
Ans:No Map does not allow duplicate keys in java
 */


import java.util.*;

public class Question15 {

    public static void main(String[] args) {


    Map<String, String> phonebook = new HashMap<>();
    phonebook.put("Alice","123-456");
    phonebook.put("Bob","789-012");

    // Attempting to add a duplicate key:
    phonebook.put("Alice","987-654"); // Overwrites the previous value for "Alice"

    System.out.println(phonebook); // Prints: {Alice=987-654, Bob=789-012}
}
}
