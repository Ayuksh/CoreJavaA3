class Program7
{
	public static void main(String[] args)
	{
		int a = 9 ;
		
		String ans = (a%3==0) ? 
					((a%5==0)?"3 & 5":"ONLY 3")
					:
					((a%5==0)?"ONLY 5": "NOT DIVISIBLE");
		System.out.println(ans );
	}
}