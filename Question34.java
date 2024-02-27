/*34.Is ArrayList and LinkedList allows duplicate elements?
Ans:
Yes, both ArrayList and LinkedList allow duplicate elements. They implement the List interface,
which doesn't impose any restrictions on element uniqueness.


*/





import java.util.ArrayList;
import java.util.LinkedList;
public class Question34 {

        public static void main(String[] args) {
            ArrayList<String> arrayList = new ArrayList<>();
            LinkedList<String> linkedList = new LinkedList<>();

            // Adding elements (including duplicates)
            arrayList.add("Red");
            arrayList.add("Green");
            arrayList.add("Blue");
            arrayList.add("Red"); // Duplicate

            linkedList.add("Red");
            linkedList.add("Green");
            linkedList.add("Blue");
            linkedList.add("Red"); // Duplicate

            // Printing elements (duplicates will be present)
            System.out.println("Elements in ArrayList:");
            for (String color : arrayList) {
                System.out.println(color);
            }

            System.out.println("Elements in LinkedList:");
            for (String color : linkedList) {
                System.out.println(color);
            }
        }
    }







