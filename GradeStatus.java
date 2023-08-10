import java.util.Scanner ;
	
class GradeStatus
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER GRADE ");
		char grade = sc.next().charAt(0);
		checkStatus(grade );
	}
		
	public static void checkStatus( char grade )
	{
		if( grade == 'A')
			System.out.println("V.GOOD !!");
		else if(grade == 'B')
			System.out.println("GOOD !!");
		else if(grade == 'C')
			System.out.println("AVERAGE !!");
		else 
			System.out.println("POOR !!");
	}

}





