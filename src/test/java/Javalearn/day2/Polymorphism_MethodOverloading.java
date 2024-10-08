package Javalearn.day2;

public class Polymorphism_MethodOverloading {
    static int Multiply(int a,int b)
    {
        return (a*b);
    }
    static int Multiply(int a, int b, int c)
    {
        return(a*b*c);
    }
    static double Multiply(double a,double b)
    {
        return (a*b);
    }

    public static void main(String[] args) {
        System.out.println(Multiply(5,6));
        System.out.println(Multiply(7,8,9));
        System.out.println(Multiply(4.5,2.5));
    }
}
