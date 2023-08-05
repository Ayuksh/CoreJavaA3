class Calculator
{
	public static void add( int a , int b )
	{
		System.out.println("ADD A+B : "+ (a+b) );
	}
		
	public static void sub( int a , int b )
	{
		System.out.println("SUB A-B : "+ (a-b) );
	}
	
	public static void mul( int a , int b )
	{
		System.out.println("MUL A*B : "+ (a*b) );
	}
	
	public static void div( int a , int b )
	{
		System.out.println("DIV A/B : "+ (a/b) );
	}

	public static void main(String[] args)
	{
		add( 2 , 4);
		sub( 30 , 20 );
		div( 7 , 2);
		mul( 2 , 8 );
	}
}
		