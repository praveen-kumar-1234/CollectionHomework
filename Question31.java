/*31.Is HashSet maintain Insertion order of the elements?
Ans:
No HashSet does not maintain Insertion order.It internally uses a hash table for
efficient storage and retrieval, which doesn't guarantee any particular order.


*/




import java.util.HashSet;
public class Question31 {

        public static void main(String[] args) {
            HashSet<String> colors = new HashSet<>();

            colors.add("Red");
            colors.add("Green");
            colors.add("Blue");
            colors.add("Yellow");

            System.out.println("Elements in HashSet (no guaranteed order):");
            for (String color : colors) {
                System.out.println(color);
            }
        }
    }







