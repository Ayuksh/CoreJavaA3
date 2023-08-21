class Employee
{
	int empId ;
	String empName ;
	int empAge ;
	double empSal ;
	int yoe ;

	Employee(int empId , String empName , int empAge , double empSal , int yoe)
	{
		this.empId = empId ;
		this.empName = empName ;
		this.empAge = empAge ;
		this.empSal = empSal ;
		this.yoe = yoe ;
	}

	Employee(int empId , String empName , int empAge , double empSal)
	{
		this.empId = empId ;
		this.empName = empName ;
		this.empAge = empAge ;
		this.empSal = empSal ;
	}

	public void display()
	{
		System.out.println("EMP ID "+ empId );
		System.out.println("EMP NAME "+ empName );
		System.out.println("EMP AGE "+ empAge );
		System.out.println("EMP SALARY "+ empSal );
		System.out.println("YEAR OF EXP "+ yoe );
	}
}




class MainApp11
{
	public static void main(String[] args)
	{
		Employee emp1 = new Employee(101 , "Abc" , 25 , 75000 , 4);
		Employee emp2 = new Employee(102 , "Xyz" , 22 , 25000 );
		
		emp1.display();
		System.out.println("----------------------");
		emp2.display();
	}
}





	
