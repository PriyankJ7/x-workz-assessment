public class Tv
{
private static String open="hand";

public static String getChannel()
{
	return open;
	
}



public static void setChannel(String reopen)
{
	if(reopen.equlas("remote")|| reopen.equlas("andriod"))
	{
		System.out.println("tv open "+open);
		
		open=reopen;
		
	}
	else
	{
		System.out.println("can't open");
	}
}
}
