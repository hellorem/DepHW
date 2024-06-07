package Department;

public class Employee {
    String empname;
    String title;
    int salary;

    void List() {
        System.out.println("Name = " + empname);
        System.out.println("Salary = " + salary);
        System.out.println("Title = " + title);
        System.out.println("---------" );
    }
}
