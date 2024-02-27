/*20.What is the purpose of the ListIterator interface?
Ans:We can read the data from only List classes
    ex:ArrayList,Vector
    It is not a universal cursor
    get the object:listIterator()
    Methods:
    hasNext(),next(),hasPrevious(),previous(),nextIndex(),previousIndex(),remove(),add(),set()
    Operations:read,remove,add,replace
    cursor Direction:Bi-directional cursors
 */


import java.util.*;
public class Question20 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("chilaka");
        names.add("molaka");
        names.add("pilaka");
        names.add("gilaka");
        names.add("maraka");
        ListIterator<String> lstr = names.listIterator();
        while(lstr.hasNext())
        {
            String name = lstr.next();
            System.out.println("Forward name ....."+name);
        }
        while(lstr.hasPrevious())
        {
            String name = lstr.previous();
            System.out.println("backward name ....."+name);
        }
    }

}
