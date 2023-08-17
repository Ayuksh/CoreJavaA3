import java.util.Scanner ;

class Laptop
{
	String companyName ;
	String model ;
	double price ;
	String color ;
	String processor ;
	
	public void display()
	{
		System.out.println("LAPTOP COMPANY NAME "+ companyName );
		System.out.println("LAPTOP MODEL "+ model );
		System.out.println("LAPTOP PRICE "+ price );
		System.out.println("LAPTOP COLOR "+ color);
		System.out.println("LAPTOP PROCESSOR "+ processor );
	}
}



class MainApp5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Laptop l1 = new Laptop();
		System.out.println("ENTER COMPANY NAME ");
		l1.companyName = sc.next();
		System.out.println("ENTER MODEL");
		l1.model = sc.next();
		System.out.println("ENTER LAPTOP PRICE ");
		l1.price = sc.nextDouble();
		System.out.println("ENTER COLOR ");
		l1.color = sc.next();
		System.out.println("ENTRE PROCESSOR ");
		l1.processor = sc.next();

		
		l1.display();
	}
}
	
		
	 