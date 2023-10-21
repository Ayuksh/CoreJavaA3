package methodOverriding;

public class Tester extends Employee{
    public Tester(int empId, String empName, double empSalary, String department) {
        super(empId, empName, empSalary, department);
    }

    @Override
    public void job() {
        System.out.println("TESTING APPLICATION");
    }

    public void testingApproach()
    {
        System.out.println("MANUAL APPROACH");
    }
}
