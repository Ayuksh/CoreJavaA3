package javaApi;

public class MainApp2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101 , "Aman" , 25000);
        Employee emp2 = new Employee(102 , "Sanket" , 20000);
        Employee emp3 = emp1 ;
        System.out.println(emp1.hashCode() == emp3.hashCode());
        System.out.println(  emp1.equals(emp3) );

    }
}
