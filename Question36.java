/*36.Is HashTable maintain Insertion order of the elements?
Ans:
No, HashTable does not maintain the insertion order of elements.


 */





import java.util.Hashtable;
public class Question36 {

        public static void main(String[] args) {
            Hashtable<String, Integer> numbers = new Hashtable<>();

            numbers.put("one", 1);
            numbers.put("two", 2);
            numbers.put("three", 3);

            System.out.println("Elements in HashTable (no guaranteed order):");
            for (String key : numbers.keySet()) {
                System.out.println(key + " -> " + numbers.get(key));
            }
        }
    }






