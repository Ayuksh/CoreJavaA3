class Program4
{
	public static void demo()
	{
		System.out.println("DEMO START !!");
		System.out.println("DEMO END !!");
	}
	
	public static void master()
	{
		System.out.println("MASTER START !!");
		System.out.println("MASTER END !!");
	}

	public static void sample()
	{
		System.out.println("SAMPLE START !!");
		demo();
		master();
		System.out.println("SAMPLE END !!");
	}

	public static void main(String[] args)
	{
		System.out.println("MAIN START !!");
		sample();
		System.out.println("MAIN END !!");
	}
}










	