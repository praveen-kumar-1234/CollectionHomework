/*32.Is LinkedHashSet maintain Insertion order of the elements?
Ans:
Yes

 */


import java.util.LinkedHashSet;
public class Question32 {

        public static void main(String[] args) {
            LinkedHashSet<String> colors = new LinkedHashSet<>();

            colors.add("Red");
            colors.add("Green");
            colors.add("Blue");
            colors.add("Yellow");

            System.out.println("Elements in LinkedHashSet (insertion order):");
            for (String color : colors) {
                System.out.println(color);
            }
        }
    }



