/*21.What is the use of for-each loop?
Ans:To print the data from starting to ending

    When to use it:
    When you only need to access or process each element, not modify the collection itself.
    When you don't require explicit control over the index or need to modify the collection during iteration.


*/

public class Question21 {

    public static void main(String[] args) {
        String[] colors = {"red", "green", "blue"};
        for (String color : colors) {
            System.out.println(color);
        }
    }


}
