class Demo14
{
	String v1 = "instance variable";
	
	public void display()
	{
		String v1 = "loacl variable ";
		System.out.println("THIS : "+ this);
	}
	
	public static void main(String[] args)
	{
		Demo14 d1 = new Demo14();
		System.out.println("REF : "+d1);
		d1.display();
	}
}