package Javalearn.day8;

import java.util.ArrayList;
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
        myList.add(null);
        myList.add(null);
        myList.add(true);
        myList.add('A');

        //Size of an ArrayList
        System.out.println("Size of an ArrayList"+myList.size());
    }
}
