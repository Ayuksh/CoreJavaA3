package javaApi;

public class MainApp1 {
    public static void main(String[] args) {
       Employee emp1 = new Employee(101 , "Kunal" , 2500);
       Employee emp2 = new Employee(101 , "Kunal" , 2500);
       Employee emp3 = emp1 ;
       emp3.empName = "Chetan";

        System.out.println(emp3.empName);
        System.out.println(emp1.empName);
    }
}
