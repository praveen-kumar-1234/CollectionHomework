/*35.Is HashMap maintain Insertion order of the elements?
Ans:
No, HashMap does not maintain the insertion order of elements



 */





import java.util.HashMap;
public class Question35 {

        public static void main(String[] args) {

                    HashMap<String, Integer> numbers = new HashMap<>();

                    numbers.put("one", 1);
                    numbers.put("two", 2);
                    numbers.put("three", 3);
                    numbers.put("four", 4);

                    System.out.println("Elements in HashMap (no guaranteed order):");
                    for (String key : numbers.keySet()) {
                        System.out.println(key + " -> " + numbers.get(key));
                    }
                }
            }





