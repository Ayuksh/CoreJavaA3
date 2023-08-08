import java.util.Scanner ;

class AreaOfTriangle
{
	public static void area(double hight , double base )
	{
		double areaOfTriangle = (0.5) * base * hight ;
		System.out.println("AREA OF TRIANGLE = "+ areaOfTriangle );
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER BASE LENGTH :");
		double base = sc.nextDouble();
		System.out.println("ENTER HIGHT OF TRIANGLE :");
		double hig = sc.nextDouble();
		
		area( hig , base );
	}
}


		






