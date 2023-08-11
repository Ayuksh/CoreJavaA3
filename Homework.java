import java.util.Scanner ;

class Homework
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("ENTER NUMBER ");
		int a = sc.nextInt();
		
		if( a%3 == 0 )
		{
			if( a%5 == 0 )
				System.out.println("NUMBER IS DIVISIBLE BY 3 & 5");
			else
				System.out.println("NUMBER IS DIVISIBLE BY ONLY 3");
		}else if( a%5 == 0 )
				System.out.println("NUMBER IS DIVISIBLE BY ONLY 5");
		else
				System.out.println("NUMBER IS NOT DIVISIBLE BY 3&5 ");
	}
}


				
		