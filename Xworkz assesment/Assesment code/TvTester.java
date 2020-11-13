public class TvTester
{
	public static void main(String[] test)
{
String value=test[0];
System.out.println("JVM invoked main");
String openValue=Tv.getChannel();
System.out.println("openValue is:"+openValue);

Tv.setChannel(value);
 openValue=Tv.getChannel();
 System.out.println("openValue is:"+openValue);
 

	
}