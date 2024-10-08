package Javalearn.day2;
//Method Overriding
public class India_MethodOverride
{
public void speaking()
{
    System.out.println("I can speak Indian Languages");
}
static class Kerala extends India_MethodOverride
{
    public void speaking()
    {
        System.out.println("I can speak Malayalam");
    }
}
static class Tamilnadu extends India_MethodOverride
{
    public void speaking()
    {
        System.out.println(" I can speak Tamil");
    }
}

    public static void main(String[] args) {
        India_MethodOverride Lan1 = new India_MethodOverride();
        India_MethodOverride Lan2 = new Kerala();
        India_MethodOverride Lan3 = new Tamilnadu();

        Lan3.speaking();

    }
}
