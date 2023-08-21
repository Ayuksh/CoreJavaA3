class Product
{
	int productId ;
	String productName ; 
	double productPrice ;
	String productMaf ;
	String productExp ;
	String productType ;
	
	 public Product( int productId , String name , double price , String maf , String exp , String type )
	{
		System.out.println("CONSTRUCTOR EXECUTING !!");
		this.productId = productId ;
		productName = name ;
		productPrice = price ;
		productMaf = maf ;
		productExp = exp ;
		productType = type ;
	}

	public void displayDetails()
	{
		System.out.println("---------------------------");
		System.out.println("ID "+ productId );
		System.out.println("NAME "+ productName );
		System.out.println("PRICE  "+ productPrice );
		System.out.println("MAF "+ productMaf );
		System.out.println("EXP "+ productExp );
		System.out.println("TYPE "+ productType );
	}
}

class MainApp8
{
	public static void main(String[] args)
	{
		Product p1 = new Product(101 , "TATA SALT" , 20 , "09-2022" , "09-2024" , "GROCERY");
		Product p2 = new Product(102 , "AMUL  MILK" , 50  , "18-2023" , "19-2023" , "GROCERY");
		
		if(p1.productId == 102)
			p1.productPrice = 40 ;

		p1.displayDetails();
		p2.displayDetails();
	}
}
		





