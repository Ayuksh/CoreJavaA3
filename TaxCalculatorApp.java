import java.util.Scanner ;

class TaxCalculatorApp 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER GROSS SALARY : ");
		double gross = sc.nextDouble() ;	
		System.out.println("ENTER SAVING ") ;
		double save = sc.nextDouble() ;
			
		double finalAmt = taxCalculator( gross , save );
		
		System.out.println("YOUR TOTAL TAX IS "+ finalAmt );
		
	}

		
	public static double taxCalculator( double gs , double s )
	{
		double taxAmt ;
		double netTax = 0 ;
		
		if(s >= 1000)
			taxAmt = gs - 1000 ;
		else
			taxAmt = gs - s ;

		if( taxAmt >0)			// slab 0 
			netTax = 0 ;
	
		if(taxAmt > 1000)		//slab 1
			netTax = netTax + ((taxAmt-1000) * 0.1);
			
		if(taxAmt > 2000)		//slab 2 
			netTax = netTax + ((taxAmt - 2000) * 0.2);

		if(taxAmt > 5000)		
			netTax = netTax + ((taxAmt - 5000) * 0.3);
		
		return netTax ;
	}

}








