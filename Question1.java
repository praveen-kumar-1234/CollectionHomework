/*
1.What is the collection framework?
Ans:Collection Framework provides  classes and interfaces that we use to store and manage objects inside a
collection.
Collection means a group of individual objects represented as a single entity
 */

import java.util.*;
public class Question1 {

    public static void main(String[] args)
    {
        // Create an ArrayList of strings
        ArrayList<String> names = new ArrayList<>();

        // Add elements to the list
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Access elements by index (0-based)
        System.out.println("The first element is: " + names.get(0));

        // Modify an element
        names.set(1, "David");

        // Remove an element
        names.remove("Charlie");

        // Iterate through the list using a for-each loop
        for (String name : names) {
            System.out.println(name);
        }
    }

}
