package Javalearn.day4.superKey;

public class Animal {
    String color = "White";
    void eat ()
    {
        System.out.println("I am eating");
    }
}
class Dog extends Animal
{
    String color = "Black";
    void display ()
    {
        System.out.println(color);
        System.out.println(super.color);
    }
    void eat ()
    {
        System.out.println("I am eating dosa");
        super.eat();
    }
}
