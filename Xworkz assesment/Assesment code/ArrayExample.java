public class ArrayExample
{
public static void main(String[] args)
{
	
	System.out.println("This method is invoked by JVM");
	placment();
}

public static void placment()
{

String company="xworkz";
String place="Bangelore";

String[] all={company, place};

int size=all.length;
System.out.println("Size is:"+size);

String index0=all[0];
System.out.println("index 0 is"+index0);

}
}