package abstraction;

public abstract class Tester implements Employee{
    public int employeeId ;
    String employeeName ;
    double employeeSalary ;
    public void displayDetails(){
        System.out.println("id "+ employeeId);
        System.out.println("name "+ employeeName);
        System.out.println("salary" + employeeSalary);
    }
}
