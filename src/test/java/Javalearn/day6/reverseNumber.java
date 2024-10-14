package Javalearn.day6;

public class reverseNumber {
    public static void main(String[] args) {
        //Using While Loop
        int num =12241;
        int rev = 0;
        while (num>0)
        {
            int digit = num%10;
            rev = rev*10+digit;
            num = num/10;
        }
        System.out.println("The reversed number is "+rev);
    }
}
