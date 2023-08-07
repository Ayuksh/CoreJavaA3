class Program6
{
	public static int display(int a , int b)
	{
		int sum = a+b ;
		return sum ;
	}
		
	public static void main(String[] args)
	{
		int c = display( 20 , 30 ) + display(300 , 20 );
		System.out.println(c);
	}
}