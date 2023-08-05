class Circle
{
	public static void area( int r )
	{
		double area = 3.14 * r * r ;
		System.out.println("AREA OF CIRCLE : "+ area);
	}
	
	public static void main(String[] args)
	{
		area( 10 );
		area( 9 );	
	}
}