class Program9
{
	static{
		System.out.println("STATIC BLOCK OF PROGRAM9 !!");
	}

	public static void main(String[] args)
	{
		System.out.println("MAIN METHOD START !!");
		new Program9().display();
		System.out.println("MAIN METHOD END !!");
	}

	public void display()
	{
		System.out.println("DISPLAY METHOD !!");
		int b = Program10.a;
	}
}

class Program10
{
	static{
		System.out.println("STATIC BLOCK OF PROGRAM10 ");	
	}	
	
	static int a = 10 ;	
		
	public static void test()
	{
		System.out.println("TEXT METHOID !!");
	}
}