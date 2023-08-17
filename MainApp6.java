class Demo1
{
	Demo1()
	{
		System.out.println("THIS IS CONSTRUCTOR !!");	
	}
	public void display()
	{
		System.out.println("DISPLAY METHOD ");
	}
}

class MainApp6
{
	public static void main(String[] args)
	{
		Demo1 d1 = new Demo1();
		d1.display();

		Demo1 d2 = new Demo1();
		new Demo1();
	}
}
		