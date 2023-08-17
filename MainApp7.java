class Student
{
	String name ;
	double m1 , m2 , m3 , m4 , m5 ;
	
	public void percentageCalculate()
	{
		double per = (m1+m2+m3+m4+m5)/5 ;
		
		System.out.println("STUDENT NAME "+ name );
		System.out.println("PERCENTAGE "+ per );
	}
}

class MainApp7
{
	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.name = "KUNAL";
		s1.m1 = 40 ; 
		s1.m2 = 50 ;
		s1.m3 = 40 ; 
		s1.m4 = 60 ;
		s1.m5 = 50 ;
		s1.percentageCalculate();

		
		Student s2 = new Student();
		s2.name = "omakr";
		s2.m1 = 40 ; 
		s2.m2 = 55 ;
		s2.m3 = 50 ; 
		s2.m4 = 70 ;
		s2.m5 = 50 ;
		s2.percentageCalculate();
		s1.percentageCalculate();


		System.out.println("MARKS OF KUNAL IN M3 "+ s1.m3 );
		System.out.println("MARKS OF omakr IN M3 "+ s2.m3 );

	}
}






