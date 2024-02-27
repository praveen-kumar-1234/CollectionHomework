/*7.Is List allows duplicate elements?
Ans:Yes List allow duplicate elements

 */

import java.util.*;
public class Question7 {

    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Bread");
        shoppingList.add("Milk"); // Duplicate allowed

        System.out.println(shoppingList); // Prints: [Milk, Bread, Milk]
    }
}
