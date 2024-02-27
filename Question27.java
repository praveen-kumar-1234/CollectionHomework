/*27.When should we use the LinkedHashSet class?
Ans:
Here's when to use the LinkedHashSet class with an example program:

When to Use LinkedHashSet:

Storing unique elements while preserving insertion order: LinkedHashSet offers the uniqueness
guarantee of a HashSet while maintaining the order in which elements were added.
 */




import java.util.LinkedHashSet;
public class Question27 {

        public static void main(String[] args) {
            LinkedHashSet<String> visitedUrls = new LinkedHashSet<>();

            visitedUrls.add("https://www.google.com");
            visitedUrls.add("https://www.example.com");
            visitedUrls.add("https://www.facebook.com");
            visitedUrls.add("https://www.google.com"); // Duplicate, won't be added

            System.out.println("Visited URLs in order:");
            for (String url : visitedUrls) {
                System.out.println(url);
            }
        }
    }




