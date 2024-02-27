/*
 2.What is the purpose of the collection framework?
 The purpose of the Collection framework in Java (and many other languages) is to provide
 a standardized and efficient way to store and manage groups of objects. Imagine you have a
 bunch of grocery items you need to organize. You wouldn't dump them all in a single bag, right?
 Different items need different handling. The Collection framework offers various "bags" with
 specific functionalities.
*/
import java.util.*;
public class Question2 {

    public static void main(String[] args)
    {
        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Alice");
        uniqueNames.add("Bob");
        uniqueNames.add("Alice"); // Duplicate ignored

        System.out.println("Number of names: " + uniqueNames.size()); // Prints 2

    }
}
