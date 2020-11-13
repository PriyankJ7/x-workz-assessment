public class Array
{
public static void main(String[] args)
{
	
	System.out.println("This method is invoked by JVM");
	talikng();
}

public static void talikng()
{

String name="Priyank";
String LastName="Jirankalli";

String[] all={name,LastName};

int size=all.length;
System.out.println("Size is:"+size);

String index0=all[0];
System.out.println("index 0 is"+index0);

}
}