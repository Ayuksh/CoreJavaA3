class PercentageCalculator
{
	public static void calculator(String name , int m1 , int m2 , int m3, int m4 , int m5 )
	{
		double per = (m1+m2+m3+m4+m5) / 5 ;
		System.out.println(name + " HIS PERCENTAGE ARE "+ per );
	}
	
	public static void main(String[] args)
	{
		calculator("OMKAR" , 45 , 33 , 100 , 20 , 37 );
		calculator("KARAN" , 50 , 50 , 50 , 50 , 50 );
	}
}
		