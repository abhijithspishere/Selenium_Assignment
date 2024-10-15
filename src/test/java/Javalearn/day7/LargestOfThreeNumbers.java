package Javalearn.day7;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        double num1 = sc.nextDouble();

        System.out.println("Enter the second number");
        double num2 = sc.nextDouble();

        System.out.println("Enter the third number");
        double num3 = sc.nextDouble();

       /* if (num1>=num2&&num1>=num3)
        {
            System.out.println(num1+" is the largest");
        } else if (num2>=num1&&num2>=num3) {
            System.out.println(num2 + " is the largest");
        }
            else
            {
                System.out.println(num3+" is the largest");
            }*/

        //Using Math.max
        double Largest = Math.max(num1,Math.max(num2,num3));
        System.out.println(Largest+" is the largest");
        sc.close();

        }
    }

