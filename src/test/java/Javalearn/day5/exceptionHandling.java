package Javalearn.day5;

import java.util.Scanner;

public class exceptionHandling {
    public static void main(String[] args) {
        System.out.println("Program is Starting");

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();


            int result;
            try{
                result = 100/num;
                System.out.println(result);
            }

        catch (Exception e)
        {
            System.out.println("Invalid Data Provided");
            System.out.println(e.getMessage());
        }*/
        Scanner sc = new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter the position to which number to be entered in between 0-4");
        int pos = sc.nextInt();
        System.out.println("Enter a arrayValue");
        int value = sc.nextInt();

        try {
            a[pos] = value;
        } catch (Exception e) {
            System.out.println("Invalid position");
            System.out.println(e.getMessage());
        }


    }
}
