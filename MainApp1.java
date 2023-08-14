class MainApp1
{
	public static void main(String[] args)
	{
		System.out.println("MAIN METHOD START");
		System.out.println(  Demo1.display( 10 )  );
		System.out.println(  Demo1.display( 90 )  );
		System.out.println("MAIN METHOD END ");
	}
}

class Demo1
{
	static int a = 100 ;
		
	public static int display( int b )
	{
		return a+b ;
	}
}
		