package Javalearn.day9;



import java.util.HashMap;
import java.util.Map;
import java.io.*;

public class WordOccurence {
    public static void main(String[] args) {
        String str = "Alice is girl and Bob is Boy";

        Map<String, Integer> hash = new HashMap<>();

        String[] words = str.split(" ");

        for (String word : words)
        {
         if (hash.containsKey(word))
         {
             hash.put(word,hash.get(word)+1);
         }

         else
         {
             hash.put(word,1);
         }


        }
        System.out.println(hash);
    }
}
