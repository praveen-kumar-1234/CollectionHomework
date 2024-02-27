/*17.What is the purpose of the Enumeration interface?

Purpose of Enumeration:

Introduced in Java 1.0, Enumeration provided a way to sequentially iterate through elements in a collection.
It offered methods like hasMoreElements() to check for remaining elements and nextElement() to retrieve the
next element.

However, it had limitations:
Only allowed forward iteration (no moving back).
Didn't provide a method to remove elements during iteration.
Not generic, meaning it couldn't work with different data types.


 */


import java.util.*;
public class Question17 {

    public static void main(String[] args)
    {
        Vector<String> names = new Vector<String>();
        names.add("chilaka");
        names.add("molaka");
        names.add("pilaka");
        names.add("gilaka");
        names.add("maraka");

        Enumeration<String> enumeration = names.elements();
        while(enumeration.hasMoreElements())
        {
            String element = enumeration.nextElement();
            System.out.println("Your name....."+element);
        }
    }

}
