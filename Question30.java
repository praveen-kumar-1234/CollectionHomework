/*30.When should we use the HashTable class?
Ans:
When to Consider HashTable:

Thread-safety is a primary concern: If you absolutely need thread-safety and
cannot use external synchronization mechanisms, HashTable might be an option.

Legacy code compatibility: If you're working with older code that relies on HashTable,
you might need to use it for compatibility.

 */




import java.util.Hashtable;
public class Question30 {

        public static void main(String[] args) {
            Hashtable<String, Integer> numbers = new Hashtable<>();

            numbers.put("one", 1);
            numbers.put("two", 2);
            numbers.put("three", 3);

            // Retrieving a value
            Integer value = numbers.get("two");
            System.out.println("Value for key 'two': " + value);

            // Checking if a key exists
            boolean containsKey = numbers.containsKey("four");
            System.out.println("Contains key 'four': " + containsKey);

            // Iterating through key-value pairs
            for (String key : numbers.keySet()) {
                System.out.println(key + " -> " + numbers.get(key));
            }
        }
    }


