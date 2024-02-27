/*19.What is the purpose of the Iterator interface?
Ans:We can read the data from all Collection classes
    ex:ArrayList,HashSet,Vector
    It is a universal cursor
    get the object:iterator()
    Methods:
    hasNext():To check the data present or not
    next():To read the data
    remove():To remove the data
    Operations:read and remove
    cursor Direction:Forward cursor




 */


import java.util.*;
public class Question19 {

public static void main(String[] args)
{
    HashSet<String> sweets = new HashSet<String>();
    sweets.add("jilebi");
    sweets.add("gulabjam");
    sweets.add("laddu");
    sweets.add("palakova");
    sweets.add("kesari");
    Iterator<String> iterator = sweets.iterator();
    while(iterator.hasNext())
    {
        String sweet = iterator.next();
        if(sweet.equals("palakova"))
        {
            iterator.remove();
        }
    }
    System.out.println(sweets);
}

}
