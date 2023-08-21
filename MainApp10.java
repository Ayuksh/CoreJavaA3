class Add
{
	int a ,b ;
	
	Add()
	{
		System.out.println("CONSTRUCTOR 1 !!");
	}
	
	Add(int a , double b )
	{
		System.out.println("CONSTRUCTOR 2 !!");
	}

	Add(double b , int a )
	{
		System.out.println("CONSTRUCTOR 3 !!");
	}
}

class MainApp10
{
	public static void main(String[] args)
	{
		new Add( 1 , 1.8 );
	}
}
		








