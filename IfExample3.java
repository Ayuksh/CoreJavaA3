import java.util.Scanner ;

class IfExample3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER ");
		int a = sc.nextInt();
		display(a);
	}
	
		
	public static void display(int a )
	{
		if(a == 0)
			return ;
		
		System.out.println(a);
		display(a-1);
	}
}