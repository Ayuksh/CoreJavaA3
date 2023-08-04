class{
	public static void main(String[] args){
		//DECLARATION WITH INITILIZATION
		String employeeName="ABC";
		double employeeBasicSalary=15000;
		double employeeHra=6000,employeePf=2000;

		double monthlySal=employeeBasicSalary+employeeHra;
		double grossSalary=(employeeBasicSalary+employeeHra+employeePf)*12;
		double incremetdSalary=grossSalary+(grossSalary*0.1);

		System.out.println("EMPLOYEE NAME "+employeeName);
		System.out.println("EMPLOYEE MONTHLY SALARY "+monthlySal);
		System.out.println("PACKAGE IS "+grossSalary);
		System.out.println("INCREMETED SALARY IS "+incremetdSalary);

	}
}