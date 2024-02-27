/*33.Is HashSet and LinkedHashSet allow duplicate elements?
Ans:
No, neither HashSet nor LinkedHashSet allow duplicate elements.
They both implement the Set interface, which by definition guarantees that each element is
unique within the collection.



*/


import java.util.HashSet;
import java.util.LinkedHashSet;
public class Question33 {

        public static void main(String[] args) {
            HashSet<String> hashSet = new HashSet<>();
            LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

            // Adding elements (including duplicates)
            hashSet.add("Red");
            hashSet.add("Green");
            hashSet.add("Blue");
            hashSet.add("Red"); // Duplicate

            linkedHashSet.add("Red");
            linkedHashSet.add("Green");
            linkedHashSet.add("Blue");
            linkedHashSet.add("Red"); // Duplicate

            // Printing elements (no duplicates will be present)
            System.out.println("Elements in HashSet:");
            for (String color : hashSet) {
                System.out.println(color);
            }

            System.out.println("Elements in LinkedHashSet:");
            for (String color : linkedHashSet) {
                System.out.println(color);
            }
        }
    }






