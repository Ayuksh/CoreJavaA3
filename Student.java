class Student{
	public static void main(String[] args){
		//1 DECLRATION
		char div;
		String name;
		short totalMarks;
		float per;
		long contactNumber;

		//2 INITILIZATION
		div='A';
		name="MAHESH PATIL";
		totalMarks=1234;
		per=88.88f;
		contactNumber=9860586634l;

		System.out.println("DIVISION IS "+div);
		System.out.println("NAME IS "+name);
		System.out.println("MARKS IS "+totalMarks);
		System.out.println("PERCENTAGE IS "+per);
		System.out.println("CONATCT NUMBER IS "+contactNumber);

		//3 Reinitilization
		div='B';
		System.out.println("AFTER REINITILIZATION DIV IS "+div);
	}
}