public class MethodOverLoad
{
	public static void main(String[] test)
	{
		System.out.println("Invoked by JVM");
		playing("Dhoni");
		playing("Kohli", 11);
		playing(8,"ABC");
		
}
public static void playing(String playersName)
	{
		System.out.println("The Players name is:"+playersName);
		
	}
	
public static void playing(String playersName,int noOfPlayers)
	{
		System.out.println("playersName is :"+playersName);
		System.out.println("noOfPlayers is :"+noOfPlayers);
	}
	
	public static void playing(int NoOfBatsmans, String nameOfBollers)
	{
		System.out.println("NoOfBatsmans is :"+NoOfBatsmans);
		System.out.println("noOfBollers is:"+nameOfBollers);
	}
}