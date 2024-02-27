/*26.When should we use the HashSet class?
When to Use HashSet:

Storing unique elements: HashSet guarantees that every element is unique,
automatically eliminating duplicates.

Faster lookups and membership checks: HashSet excels at checking if an element exists
within the set (average O(1) time complexity), making it ideal for frequent membership tests.

Order doesn't matter: HashSet doesn't preserve the order of elements.
If order is crucial, consider LinkedHashSet or TreeSet.

No need for frequent iterations: While iterating through elements is possible,
it's not as efficient as with lists.
 */





import java.util.Collections;
import java.util.HashSet;
public class Question26 {

        public static void main(String[] args) {
            String sentence = "To be or not to be, that is the question";
            String[] words = sentence.split(" ");

            HashSet<String> uniqueWords = new HashSet<>();

            Collections.addAll(uniqueWords, words);

            System.out.println("Unique words: " + uniqueWords);
        }
    }


