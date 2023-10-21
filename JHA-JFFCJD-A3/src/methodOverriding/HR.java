package methodOverriding;

public class HR extends Employee {
    public HR(int empId, String empName, double empSalary, String department) {
        super(empId, empName, empSalary, department);
    }

    @Override
    public void job() {
        System.out.println("DOING TIME PASS !!");
    }

    public void irritatingOther()
    {
        System.out.println("CONDUCTING EVENTS !!");
    }
}
