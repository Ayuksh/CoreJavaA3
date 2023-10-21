package methodOverriding;

public class Developer extends Employee {

    public Developer(int empId, String empName, double empSalary, String department) {
        super(empId, empName, empSalary, department);
    }

    @Override
    public void job() {
        System.out.println("DEVELOPING APPLICATION ");
    }

    public void language()
    {
        System.out.println("DEVELOP APPLICATION USING JAVA AND REACT ");
    }
}
