import java.util.Scanner ;

class DiscountApp2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER TOTAL AMOUNT !!");
		double amt = sc.nextDouble();
			
		 amt = getDiscount(amt);
		
		System.out.println("FINAL AMOUNT : "+ amt );
		
		
	}

	public static double getDiscount( double amt )
	{
		if(amt >= 2000 )
			return amt - amt*0.2 ;
		
		if(amt >= 1000)
			return amt - amt * 0.1 ;
	
		return amt ;
	}
}
		