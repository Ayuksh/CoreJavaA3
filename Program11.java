class Program11 
{
	public static void main(String[] args)
	{
		MethodChain m1 = new MethodChain();			
		m1.abc().jkl().xyz().abc().jkl().xyz().jkl().pqr();

		MethodChain m2 = new MethodChain();
		m2.xyz().abc().jkl().xyz().pqr();
		
	}
}

class MethodChain
{
	public MethodChain abc()
	{
		System.out.println("ABC METHOD " + this);
		return this ;
	}

	public MethodChain jkl()
	{
		System.out.println("JKL METHOD "+this);
		return this ;
	}
	
	public MethodChain xyz()
	{
		System.out.println("xyz METHOD "+this);
		return this ;
	}

	public void pqr()
	{
		System.out.println("PQR METHOD "+this);
	}
}