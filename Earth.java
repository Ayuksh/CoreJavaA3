class Human
{
	int hands = 2 ;
	int legs = 2 ;
			
	public void displayState()
	{
		System.out.println("--------------");
		System.out.println("HANDS : " + hands );
		System.out.println("LEGS  : "+ legs);
	}
}

class Earth
{
	public static void main(String[] args)
	{
		Human aman = new Human();
		Human omkar = new Human();

		omkar.legs = 1 ;
		aman.hands = 0 ;

		aman.displayState();
		omkar.displayState();
	}
}
	







