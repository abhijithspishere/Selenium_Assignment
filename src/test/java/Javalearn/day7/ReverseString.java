package Javalearn.day7;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");
        String s1 = sc.nextLine();

        /*String s2 = "";

        for (int i = s1.length()-1; i >=0 ; i--)
        {
            s2 = s2+s1.charAt(i);
        }
        System.out.println(s2);*/

        //Using StringBuffer
        StringBuffer sb = new StringBuffer(s1);
        String s2= String.valueOf(sb.reverse());
        System.out.println(s2);



    }
}
