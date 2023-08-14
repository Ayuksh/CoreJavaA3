import java.util.Scanner ;
	
class AttendenceApp
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER TOTAL CLASSES HELD !!");
		int classHeld = sc.nextInt();
		System.out.println("ENTER TOTAL CLASSES ATTENDED !!");
		int classAttended = sc.nextInt();
		System.out.println("DO STUDENT HAVE MEDICAL PROBLEM ");
		char medical = sc.next().charAt(0);
			
		double percentage = classAttended * 100  /classHeld ;
		
		if(medical == 'N'){
			if(percentage >= 75)
				System.out.println("ALLOWED FOR EXAM !!");
			else
				System.out.println("NOT ALLOWED FOR EXAM !!");
		}else if(medical == 'Y')
			System.out.println("ALLOWED FOR EXAM !!");


		System.out.println("\n\n\n  DO YOU WANT TO CHECK OTHER ATTENDENCE ( 'Y' OR 'N' ) \n\n\n");
		char ch = sc.next().charAt(0);
		if(ch == 'Y')
			main(args);
31	}
}
		