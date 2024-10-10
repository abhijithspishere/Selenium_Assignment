package Javalearn.day4;

class ABC {
    void m1(int a)
    {
        System.out.println(a);
    }
    void m2(int b)
    {
        System.out.println(b);
    }
    void m1(int a, int b)
    {
        System.out.println(a+b);  //Overloading with different Number of Attributes in same class
    }
}

class XYZ extends ABC {
    void m1(int a)
    {
        System.out.println(a*a);  //overRiding
    }
    void m2(int b)
    {
        System.out.println(b*b);  //overRiding
    }
    void m1(int a, int b, int c)
    {
        System.out.println(a*b*c); //OVERLOADING
    }
}


public class OverridingvsOverloading {
    public static void main(String[] args) {
    ABC abobj = new ABC();
    abobj.m1(9,8);
    abobj.m2(6);

    XYZ xyzobj = new XYZ();
    xyzobj.m1(10,2,8);

    xyzobj.m1(8);

    }
}
