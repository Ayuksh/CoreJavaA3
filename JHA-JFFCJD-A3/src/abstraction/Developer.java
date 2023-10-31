package abstraction;

public abstract class Developer implements Employee{
    public int employeeId = 101  ;
    String employeeName = "Abc"  ;
    double employeeSalary = 25000  ;

    public void displayDetails(){
        System.out.println("id "+ employeeId);
        System.out.println("name "+ employeeName);
        System.out.println("salary" + employeeSalary);
    }
}
