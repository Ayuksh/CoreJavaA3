import java.util.Scanner ;

class Circle
{
	public static void area( double rad )
	{
		double area= 3.14 * rad * rad ;
		System.out.println("AREA OF CIRCLE IS " + area );	
	}

	public void circumference( double rad )
	{
		double cir = 2 * 3.14 * rad ; 
		System.out.println("CIRCUMFERENCE OF CIRCLE IS "+ cir );
	}
}

class MainApp3
{
	public static void main(String[] a)
	{
		Scanner sc  =  new Scanner(System.in) ;
	 
		System.out.println("ENTER RADIUS OF CIRCLE ");
		double rad = sc.nextDouble();
		
		System.out.println("\n\nSELECT THE FOLLOWING OPTION ");
		System.out.println("1. AREA OF CIRCLE ");
		System.out.println("2. CIRCUMFERENCE OF CIRCLE ");
		int ch = sc.nextInt();
		
		if(ch == 1)
			Circle.area( rad );
		else if(ch == 2)
			new Circle().circumference( rad );
		else {
			System.out.println("INVALID INPUT \n PLEASE TRY AGAIN \n\n") ;
			main(a) ;
			}
	}
}
		


















