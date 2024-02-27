/*23.When should we use the ArrayList class?
Ans:ArrayList is a container in which data will be stored in a resizable Array Format(Sequence format).
    For Searching and Data Reading ArrayList is better
    ArrayList stores only data so takes less memory

    Frequent random access of elements: ArrayList excels at retrieving elements by index quickly
    (O(1) time complexity).
    Storing elements in order of insertion: ArrayList maintains the order in which elements are added.

 */




import java.util.ArrayList;
public class Question23 {
        public static void main(String[] args) {
            ArrayList<String> names = new ArrayList<>();

            // Adding elements
            names.add("Alice");
            names.add("Bob");
            names.add("Charlie");

            // Accessing elements by index (random access)
            System.out.println("First element: " + names.get(0)); // Output: Alice

            // Iterating through elements in order
            for (String name : names) {
                System.out.println(name); // Output: Alice, Bob, Charlie
            }

            // Removing an element
            names.remove(1); // Removes "Bob"

            // Adding an element at a specific index
            names.add(1, "David");

            // Re-printing the list
            System.out.println("Updated list: " + names); // Output: [Alice, David, Charlie]
        }
    }


