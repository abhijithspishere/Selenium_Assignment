package Javalearn.day1;

public class employeeDetail {
    public static void main(String[] args) {
        employee emp = new employee();
        emp.eid = 121;
        emp.ename = "Swathy";
        emp.job = "QA Engineer";
        emp.sal = 45000;

        emp.display();
    }
}
