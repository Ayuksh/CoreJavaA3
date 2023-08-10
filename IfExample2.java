import java.util.Scanner ;

class IfExample2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER AGE ");
		int age = sc.nextInt();

		if( isEligible(age) )
			System.out.println("ELIGIBLE FOR VOTING !!");
		else
			System.out.println("NOT ELIGIBLE FOR VOTING !!");
	
	}
		
	public static boolean isEligible(int age )
	{
		if(age >= 18)
			return true ;
	
		return false ;
		
	}
		
}




	