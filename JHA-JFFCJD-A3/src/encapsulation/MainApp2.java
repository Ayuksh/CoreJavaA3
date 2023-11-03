package encapsulation;

public class MainApp2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101 , "Omakr" , 25000
        ,"average" , "software developer");


        System.out.println(emp1.getEmployeeName());
        System.out.println(emp1.getDesignation());
        System.out.println(emp1.getPerformance());
        System.out.println("------------------------------------");
        emp1.setPerformance("good");
        emp1.setDesignation("sr. developer !!");

        System.out.println(emp1.getEmployeeName());
        System.out.println(emp1.getDesignation());
        System.out.println(emp1.getPerformance());





    }
}
