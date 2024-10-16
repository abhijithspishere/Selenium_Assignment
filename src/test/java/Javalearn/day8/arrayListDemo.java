package Javalearn.day8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arrayListDemo {
    public static void main(String[] args) {

        //Declaration
//        ArrayList myList = new ArrayList();

        //Using parent class variable, we can declare ArrayList.
//        List myList = new ArrayList(); //both allows to store Heterogenous Data

        //If we need to add Homogenous Data we can do like this
      /*  ArrayList <Integer> myList = new ArrayList<Integer>();//this allows only Integer Object Data type
        ArrayList <String> myListS = new ArrayList<String>();

        myListS.add("Hi, ASP");
        System.out.println(myListS);*/

        ArrayList myList = new ArrayList();

        myList.add(100);
        myList.add(10.88);
        myList.add("Hello ASP");
        myList.add(100);
        myList.add(null);
        myList.add(null);
        myList.add(true);
        myList.add('A');

        //Size of an ArrayList
        System.out.println("Size of an ArrayList"+myList.size());
        System.out.println("Printing"+myList);

        //Removing element from arrayList
        myList.remove(3);
        System.out.println(myList+"removed");

        //Inserting arraylist element
        myList.add(2,"java");
        System.out.println(myList);

        //Modify/replace Element
        myList.set(2,"python");
        System.out.println(myList);

        //Access Specific element from arraylist
        System.out.println(myList.get(3));
        System.out.println(myList);

        //Reading all elements in ArrayList
       /* for (int i = 0; i < myList.size()-1; i++) {
            System.out.println(myList.get(i));*/

       /* for (Object x:myList) {
            System.out.println(x);
        }*/

        //USING ITERATOR
        //Iterator is only used for collections
        Iterator iter = myList.iterator(); {
            while(iter.hasNext())
            {
                System.out.println(iter.next());
            }

            //Checking arraylist is empty or not using Iterator
            Boolean emp = myList.isEmpty();//here it is Wrapper Class Object
            System.out.println(emp);

        }
    }
}
