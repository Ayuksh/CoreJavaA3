import java.util.Scanner ;

class DiscountApp
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("PLZ ENTER AMOUNT !!");
		double amt = sc.nextDouble();
		
		amt = getDiscount(amt);
		System.out.println("THE FINAL AMOUNT IS "+ amt );

	}
	
	public static double getDiscount(double amt)
	{
		return amt - (amt *0.1)	;
	}
}


