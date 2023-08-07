class AreaOfShape
{
	public static double areaOfCircle(double r)
	{
		return 3.14 * r * r;
	}
	
	public static double areaOfRectangle(double len , double wid )
	{
		return len * wid ;
	}

	public static void areaOfShape(double len , double wid , double r)
	{	
		 double area = areaOfRectangle( len , wid ) + areaOfCircle( r );
		System.out.println("AREA OF SHAPE IS "+ area );
	}
	
	public static void main(String[] args)
	{
		areaOfShape(20 , 10 , 5);
		System.out.println("-----------------------");
		areaOfShape(50 , 30 , 15);
	}
}
		





