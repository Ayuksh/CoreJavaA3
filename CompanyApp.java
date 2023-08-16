class Employee
{
	int empId ;
	String empName ;
	String empEmail ;
	double empSalary ;
	String empDept ;

	public void initEmp(int id ,String name ,String email ,double salary ,String dept )
	{
		empId = id ;
		empName = name ;
		empEmail = email ;
		empSalary  = salary ;
		empDept = dept ;			
	}

	public void displayDetails()
	{
		System.out.println("------------------------");
		System.out.println("EMP ID :"+ empId);
		System.out.println("EMP NAME :"+ empName );
		System.out.println("EMP EMAIL :"+ empEmail );
		System.out.println("EMP SALARY :"+ empSalary );
		System.out.println("EMP DEPT : "+ empDept );
	}
}


class CompanyApp
{
	public static void main(String[] args)
	{
		Employee emp1 = new Employee();
		emp1.initEmp(1101 , "KARAN" , "kar@gmail.com" , 34000 , "DEV"  );

		Employee emp2 = new Employee();
		emp2.initEmp(1102 , "VEDANT" , "vad@gmail.com" , 23000 , "TES" );

		emp1.displayDetails();
		emp2.displayDetails();
	}
}




