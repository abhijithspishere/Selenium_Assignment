package Javalearn.day7;

public class primeorNot {
    public static void main(String[] args) {
        int num = 25;
        if(num==0||num==1)
        {
            System.out.println("It is not prime");
        }
        int count =0;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        if(count>0)
        {
            System.out.println("NOT A PRIME");
        }
        else
        {
            System.out.println("PRIME");
        }
    }
}
