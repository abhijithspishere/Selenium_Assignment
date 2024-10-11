package Javalearn.day5;



interface Shape {

    //Even here it is not declared by Static and Final these variables are in Interface so By Default
    // it is Static and Final
    int length = 10;
    int width = 15;

    //This is Abstract method : There is no Body in Method
    void circle(); //By Default this is Public

    //While declaring ordinary method we have to specify whether it is STATIC OR DEFAULT.
    // Because this is INTERFACE.Interface always support abstract methods.

    default void square ()
    {
        System.out.println("This is default method in Interface : Square");
    }

    static void rectangle()
    {
        System.out.println("This is static method in Interface : Rectangle");
    }
}
public class InterfaceDemo implements Shape {

    //here void circle() is declared on interface , by default it is public in Interface so we have to provide
    public void circle()
    {
        System.out.println("This is circle : Abstract Method");
    }
    void triangle ()
    {
        System.out.println("This is triangle");
    }


    public static void main(String[] args) {


        //SCENARIO 01

       /* InterfaceDemo iobj = new InterfaceDemo();
        iobj.circle();
        iobj.square();

        //Here Shape.rectangle is declared as Static in Interface so it is accessible only through Interface keyword
        //Shape not possible using iobj and sh
        Shape.rectangle();
        System.out.println(Shape.length+Shape.width);*/


        //SCENARIO 02

        //This scenario is example for Data Abstraction
        Shape sh = new InterfaceDemo();
        sh.circle();
        sh.square();

        // We cannot call rectangle using
//        sh.rectangle();
        //Since it is a part of Interface

        //And

//        sh.triangle();
        // This also cannot call using object of Interface sh
        //since it is a part of Class not interface
        //Eventhough sh object is a part of class InterfaceDemo  created using Shape we cannot access triangle.



    }
    }


