package Javalearn.day6;

public class dataConversion {
    public static void main(String[] args) {

        //Unboxing
        //Converting String to Integer
        String s1 = "123";
        String s2 = "100";

        int sum = Integer.parseInt(s1)+Integer.parseInt(s2);//this is possible using Integer Class
        System.out.println(sum);

        //Converting String to Double
        String a1 = "100.23";
        String a2 = "156.85";

      double deciSum =  Double.parseDouble(a1)+Double.parseDouble(a2);
        System.out.println(deciSum);

        //String to Boolean
        String bool = "true";
        boolean B = Boolean.parseBoolean(bool);
        System.out.println(B);
        //We cannot convert String to Characters

        //Autoboxing
        //We can convert int,double,boolean and character to STRING using Autoboxing.
        int x = 19;
        String primitiveS = String.valueOf(x);
        System.out.println(primitiveS);
        System.out.println(primitiveS.length());

        double m = 12.99;
        String doubleM = String.valueOf(m);
        System.out.println(doubleM);
        System.out.println(doubleM.length());

        boolean gee = true;
        String boolGee = String.valueOf(gee);
        System.out.println(boolGee);
        System.out.println(boolGee.length());

        char newC = 'A';
        String newChar = String.valueOf(newC);
        System.out.println(newChar);
        System.out.println(newChar.length());


    }
}
