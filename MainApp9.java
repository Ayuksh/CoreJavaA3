class Demo15
{
	int a ;
	
	public void display()
	{
		int a = 100 ;
		System.out.println("this : "+this);	
		System.out.println("a : "+ this.a);
	}
}

class MainApp9
{
	public static void main(String[] args)
	{
		Demo15 d1 = new Demo15();
		d1.a = 10 ;
		System.out.println("D1  : "+ d1);
		d1.display();
	}
}







