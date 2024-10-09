package Javalearn.day3;



class A
{
    int a;
    void display(){
        System.out.println(a);
    }
}
class B extends A
{
int b;
void show()
{
    System.out.println(b);
}
}
public class singleInheritance {
    public static void main(String[] args) {


    B bobj= new B();

    //Here while creating the object for B we can access A also
    bobj.a =10;
    bobj.display();

    bobj.b=90;
    bobj.show();

}}
