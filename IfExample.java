import java.util.Scanner;

class IfExample
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("ENTER NUMBER 1");
		int num1 = sc.nextInt();
		System.out.println("ENTER NUMBER 2");
		int num2 = sc.nextInt();
		
		if( num1>num2 ){	 
			System.out.println("NUM1 IS GREATER THE NUM2 ");
		}
		
		if( num1<num2 ){	 
			System.out.println("NUM2 IS GREATER THE NUM1 ");
		}
			
	}
}
		