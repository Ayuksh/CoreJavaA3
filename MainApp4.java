class Central
{
	int a = 10 ;
	
	public void display()
	{
		System.out.println("DISPLAY METHOD !!");
	}
}

class MainApp4
{
	public static void main(String[] args)
	{
		Central c1 = new Central();
		System.out.println(c1);
		Central c2 = c1 ;
		System.out.println(c2);
		//c1.display();	
	}
}





