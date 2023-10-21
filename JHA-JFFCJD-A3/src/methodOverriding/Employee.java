package methodOverriding;

public class Employee {
    int empId ;
    String empName;
    double empSalary ;
    String department ;

    public Employee(int empId, String empName,
                    double empSalary, String department) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.department = department;
    }

    public void displayDetails()
    {
        System.out.println("EMP ID : "+ empId);
        System.out.println("EMP NAME : "+ empName);
        System.out.println("EMP SALARY "+ empSalary );
        System.out.println("DEPARTMENT : "+ department);
        job();
    }

    public void job()
    {
        System.out.println("JOD OF EMPLOYEE !!");
    }
}
