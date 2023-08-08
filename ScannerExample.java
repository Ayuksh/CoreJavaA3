import java.util.Scanner ;

class ScannerExample
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER NUMBER !!");
		int a = sc.nextInt();
		System.out.println("ENTER NUMBER AGAIN !!");
		int b = sc.nextInt();
		
		System.out.println("A+B : "+ (a+b));
	}
}