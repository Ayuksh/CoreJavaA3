class Program5
{
	public static void display()
	{
		System.out.println("DISPLAY METHOD EXECUTING !!");
		display();
	}
		
	public static void main(String[] args)
	{
		display();
	}
}