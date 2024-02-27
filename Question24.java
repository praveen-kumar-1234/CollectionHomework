/*24.When should we use the LinkedList class?
Ans:Linked List is a container in which data will be stored in Double Linked List format
    For Insertion and Deletion LinkedList is better
    LinkedList store data and link address so takes more memory

    Implementing stacks and queues: LinkedList's structure naturally supports these
    data structures, making it a common choice for implementing them.
    Handling large datasets: LinkedList avoids the potential resizing overhead
     of ArrayList, which can be costly for massive datasets.

 */



import java.util.LinkedList;
public class Question24 {

        public static void main(String[] args) {
            LinkedList<String> tasks = new LinkedList<>();

            // Adding elements (at the end by default)
            tasks.add("Finish homework");
            tasks.add("Buy groceries");
            tasks.add("Clean room");

            // Inserting an element at the beginning
            tasks.addFirst("Walk the dog");

            // Removing an element from the middle
            tasks.remove(2); // Removes "Buy groceries"

            // Retrieving the first and last elements
            System.out.println("First task: " + tasks.getFirst()); // Output: Walk the dog
            System.out.println("Last task: " + tasks.getLast()); // Output: Clean room

            // Iterating through the list (in insertion order)
            for (String task : tasks) {
                System.out.println(task);
            }
        }
    }




