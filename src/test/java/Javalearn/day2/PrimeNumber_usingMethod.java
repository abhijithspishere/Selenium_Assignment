package Javalearn.day2;

public class PrimeNumber_usingMethod {

    static void checkPrime(int n)
    {
        int flag = 0;
        if (n==1 || n==0)
        {
            System.out.println((n+" is not a PrimeNumber"));
        }
        for (int i =2;i<=n/2;i++)
        {
            if (n%i==0)
            {
                System.out.println(n+" is not a PrimeNumber");
                flag=1;
                break;
            }
        }
        if (flag==0)
        {
            System.out.println(n+" is a PrimeNumber");
        }
    }

    public static void main(String[] args)
    {
        checkPrime(3);
        checkPrime(4);
        checkPrime(2);
    }
}
