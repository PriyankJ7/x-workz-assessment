//3)Write example to convert string to primitive(8)

public class Convertor
{
	public static void main(String[] text)
	{
		System.out.println("JVM invoked main");
		
		
		String noOfBooks="23";
		byte convertorBook=Byte.parseByte(noOfBooks);
		System.out.println("Converted byte is:" +convertorBook);
		
		String salary="10000";
		short convertorSalary=Short.parseShort( salary);
		System.out.println("Converted short:"+convertorSalary);
		
		String noOfSjavatudents ="75500";
		int convertorStudents=Integer.parseInt(noOfSjavatudents);
		System.out.println("converted int:"+convertorStudents);
		
		String noOfPopulation="6500000";
		long convertorPopulation=Long.parseLong(noOfPopulation);
		System.out.println("converted long:"+convertorPopulation);
		
		String percentage="87.98f";
		float convertorPercentage=Float.parseFloat(percentage);
		System.out.println("converted float :"+convertorPercentage);
		
		String lifeOnElectrons="1000000000000";
	    double convertorElectrons=Double.parseDouble(lifeOnElectrons);
		System.out.println("converted double:"+convertorElectrons);
		
		String sunisblue="flase";
		boolean convertorsunisblue=Boolean.parseBoolean(sunisblue);
		System.out.println("converted boolean:"+convertorsunisblue);
		
		String alphabet="A";
		char convertor=alphabet.charAt(0);
		System.out.println("converted char is:"+convertor);
		
	
	}
}
