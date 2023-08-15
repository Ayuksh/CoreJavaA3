class MainApp2
{
	public static void main(String[] args)
	{
		System.out.println("MAIN METHOD START");
		new Sample().display();
		System.out.println("MAIN METHOD END ");
	}	
}


class Sample
{
	int a = 20 ;
	public void display()
	{
		System.out.println("DISPLAY METHOD !!" + a );
	}
	
}