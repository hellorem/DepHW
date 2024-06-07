package Department;

public class EmployeeList {
public static void main(String[] args){
    Employee emp1 = new Employee();
    Employee emp2 = new Employee();
    Employee emp3 = new Employee();
    Employee emp4 = new Employee();

    Department dep1 = new Department();

    dep1.name = "IT";
    dep1.manager = "Ayse Fatma";

    dep1.depInf();
    emp1.empname = "Ceren";
    emp1.title = "Specialist";
    emp1.salary = 100;

    emp2.empname = "Ayse";
    emp2.title = "Specialist";
    emp2.salary = 100;

    emp3.empname = "Fatma";
    emp3.title = "Specialist";
    emp3.salary = 100;

    emp4.empname = "Mehmet";
    emp4.title = "Specialist";
    emp4.salary = 100;


emp1.List();
emp2.List();
emp3.List();
emp4.List();
}

}
