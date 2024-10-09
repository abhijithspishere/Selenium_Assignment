package Javalearn.day3;

public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeEncap e = new EmployeeEncap();
        e.setName("Arjun");
        e.setSalary(25000);

        System.out.println("Name : "+e.getName());
        System.out.println("Salary : "+e.getSalary());
    }
}
