package Javalearn.day9;

import java.util.*;

public class HashsetDemo {
    public static void main(String[] args)
    {

        HashSet mySet = new HashSet();
        //can also use
//        Set mySet1 = new HashSet();

        //Can use Homogenous data using
//        HashSet <String> mySet3 = new HashSet<>();

        mySet.add("Addon");
        mySet.add(100);
        mySet.add(null);

        mySet.add(true);
        mySet.add(true);
        mySet.add('D');

        System.out.println(mySet);
        //[null, Addon, 100, D, true]
        //Here duplicate elements are removed automatically
        //And Index is not supported.

        //Removing
        mySet.remove(100);//specifying value not Index.
        System.out.println("After removing"+mySet);

        //Size of the Hashset
        System.out.println(mySet.size()+" is the size");

        //Inserting Element is not possible

        //Access Specific elements are also not possible

        //For that we need to convert to Hashset to ArrayList
        ArrayList list = new ArrayList(mySet);

        System.out.println(list);

        System.out.println(list.get(0));

//      for loop is not supported on Hashset
       /* for (Object mS : mySet)
        {
            System.out.println(mS);
        }*/

    //We can also use Iterator for reading all data
        Iterator <Objects> it = mySet.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        //Removing all elements from Hashset
        mySet.clear();
        System.out.println(mySet+"all cleared");
    }
}
