import java.util.Scanner;

class PercentageCalculatorApp
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("ENTER MAKS OF 5 SUBJECT !!");
		double m1 = sc.nextDouble();
		double m2 = sc.nextDouble();
		double m3 = sc.nextDouble();
		double m4 = sc.nextDouble();
		double m5 = sc.nextDouble();	
		
		String ans = calculate(m1, m2, m3 , m4 , m5);
		System.out.println( ans );
	}

	public static String calculate(double m1 , double m2 , double m3 , double m4 , double m5 )
	{
		double percentage = (m1+m2+m3+m4+m5)/5 ;
		return "TOTAL PERCENTAGE IS "+ percentage ;
		
	}
}















	
	