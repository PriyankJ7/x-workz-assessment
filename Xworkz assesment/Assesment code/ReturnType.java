public class ReturnType
{
	public static void main(String[] args)
	{
		System.out.println("invoked by JVM");
		String checkPercentage=result(85);
		System.out.println("the result:" +checkPercentage);
	}
	
	public static String result(double percentage)
	{
		System.out.println("invoked by main method");
		System.out.println("the result percentage is:" +percentage);
		
		if(percentage>=85 && percentage<=100)                               
		{
			 System.out.println("The return value is :"+percentage);
			 return "Destinction";
		}
		
		
	
	return "nothing";
	}
	
}