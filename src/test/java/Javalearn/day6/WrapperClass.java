package Javalearn.day6;

public class WrapperClass {
    public static void main(String[] args) {

        //These are Primitive Datatypes
        int i =10;
        double d = 9.7;
        char c = 'A';

        //Converting Primitive Datatypes to Object Type : Autoboxing
        Integer iobj = i;
        Double dobj = d;
        Character cobj = c;

        System.out.println("This is ObjectType");
        System.out.println(iobj);
        System.out.println(dobj);
        System.out.println(cobj);

        //Converting Object Type to Primitive Datatype : Unboxing

         int intValue = iobj;
         double doubleValue = dobj;
         char charValue = cobj;

        System.out.println("This is Primitive");
        System.out.println(intValue);
        System.out.println(doubleValue);
        System.out.println(charValue);


    }
}
