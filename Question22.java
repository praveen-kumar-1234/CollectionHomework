/*22.What is the load factor & default load factor for List,Set,Map?

Load Factor:

A measure of how full a collection is allowed to become before it resizes its internal storage.
Balances space efficiency and performance during operations like adding elements.


Here's a breakdown of default load factors for Lists, Sets, and Maps in Java:

Lists:

ArrayList: Doesn't have a load factor concept. It resizes its internal array by 50% whenever it's full.
LinkedList: Also doesn't have a load factor, as it dynamically allocates nodes as needed.
Sets:

HashSet: Uses a HashMap internally, so it inherits the default load factor of 0.75.
TreeSet: Doesn't use a hash table, so it doesn't have a load factor.
Maps:

HashMap: Default load factor is 0.75. This means it resizes its hash table when the number of entries reaches 75% of its current capacity.
Hashtable: Same default load factor as HashMap, 0.75.
TreeMap: No load factor, as it's not based on a hash table.

 */

import java.util.HashMap;

public class Question22 {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(); // Default load factor (0.75)

        // Add elements until the load factor is likely reached
        for (int i = 0; i < 12; i++) {
            map.put("key" + i, i);
        }

        System.out.println("Initial capacity (inferred): " + map.size()); // Usually 16

        // Add one more element to trigger resizing
        map.put("key12", 12);

        System.out.println("New capacity (inferred): " + map.size()); // Usually doubled to 32
    }
}



