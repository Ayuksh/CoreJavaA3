import java.util.Scanner ;

class AgeCalculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER AGE OF 3 PEOPLE !!");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();		

		if(a>b)
		{
			if(a>c)
				System.out.println("A IS OLDEST , WHOSE AGE IS "+ a);
			else
				System.out.println("C IS OLDEST , WHOSE AGE IS "+ c);
		}else if(b>c){
			System.out.println("B IS OLDEST , WHOSE AGE IS "+ b);
			}else{
				System.out.println("C IS OLDEST , WHOSE AGE IS "+ c);
			}
	}
}
				
	













