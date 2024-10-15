package Javalearn.day6;

public class reverseNumber {
    public static void main(String[] args) {
        //Using While Loop
        /*int num =12241;
        int rev = 0;
        while (num>0)
        {
            int digit = num%10;
            rev = rev*10+digit;
            num = num/10;
        }
        System.out.println("The reversed number is "+rev);*/

        //String Builder Insert
        /*StringBuilder sb = new StringBuilder("VintagePhoto");
        sb.insert(8,"Green ");
        sb.delete(8,13);
        sb.deleteCharAt(7);
        sb.replace(0,7,"New");
        sb.setLength(7);
        System.out.println(sb); */

        //Reversing a number using StringBuilder and Check whether it is Palindrome
        int num = 12234;
        String number = String.valueOf(num);
        StringBuilder sb = new StringBuilder(number);
        String rev = String.valueOf(sb.reverse());
        if(number.equals(rev))
        {
            System.out.println("The number is palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }




    }
}
