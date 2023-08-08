import java.util.Scanner ;

class ScannerExample1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
			
		System.out.println("ENTER NUMBER ");
		int num = sc.nextInt();

		System.out.println("ENTER NAME ");
		sc.nextLine();
		String name = sc.nextLine();

		System.out.println("NAME IS "+ name );
	}
}