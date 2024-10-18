package Javalearn.day9;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap <Integer,String> hashM = new HashMap<>();

        //Adding Pairs
        hashM.put(101,"John");
        hashM.put(109,"Scott");
        hashM.put(102,"David");
        hashM.put(102,"David");
        hashM.put(104,"Mary");

        System.out.println(hashM);

        //Size of Hashmap
        System.out.println("Size "+hashM.size());

        //Removing
        hashM.remove(101);
        System.out.println(hashM);

        //Access specific value
        System.out.println(hashM.get(102));

        //Retrieve all the Keys
        System.out.println(hashM.keySet());

        //Retrieve all the values
        System.out.println(hashM.values());

        //Retrieve all the KEY and VALUES
        System.out.println(hashM.entrySet());

        //Reading all Data using For Each Loop
        for (Integer i : hashM.keySet())
        {
            System.out.println(i+ "   "+hashM.get(i));
        }

    }
}
