//Queestion no 2) Types of variables 

//1}Program on local variables

public class Variable
{
	public static void main(String[] clr)
	{
		System.out.println(" JVM invoked main");
		Color.nameOfColor();
	}
	
	public static void nameOfColor()
	{
		String name="Red";
		public String clrname="Blue";
		
		System.out.println("The name os color is :"+name);
		System.out.println("The name os color is :"+clrname);
	}
}
