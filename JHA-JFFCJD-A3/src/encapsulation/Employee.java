package encapsulation;

public class Employee {
    private int employeeId ;
    private String employeeName ;
    private double employeeSalary ;
    private String performance ;
    private String designation ;

    public Employee(int employeeId, String employeeName,
                    double employeeSalary, String performance,
                    String designation) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.performance = performance;
        this.designation = designation;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getPerformance() {
        return performance;
    }

    public String getDesignation() {
        return designation;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
