package inheritance;

public class Employee {
    int empId ;
    String empName ;
    double salary ;
    String department ;
    int yoe ;

    public Employee(int empId, String empName, double salary, String department) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.department = department;
    }

    public Employee(int empId, String empName, double salary, String department, int yoe) {
        this(empId , empName , salary , department);
        this.yoe = yoe;
    }
}
