package unit2;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab02g
{
	public static void main( String[] args )
	{
		Fahrenheit f1 = new Fahrenheit();
		Fahrenheit f2 = new Fahrenheit();
		Fahrenheit f3 = new Fahrenheit();
		Fahrenheit f4 = new Fahrenheit();
		Fahrenheit f5 = new Fahrenheit();
		f1.setFahrenheit(98.6);
		f2.setFahrenheit(52.30);
		f3.setFahrenheit(82.45);
		f4.setFahrenheit(75.00);
		f5.setFahrenheit(100.00);
	
	System.out.println(f1.fahrenheit + " degrees Fahrenheit == "+ f1.getCelsius() +" degrees Celsius");
	System.out.println(f2.fahrenheit + " degrees Fahrenheit == "+ f2.getCelsius() +" degrees Celsius");
	System.out.println(f3.fahrenheit + " degrees Fahrenheit == "+ f3.getCelsius() +" degrees Celsius");
	System.out.println(f4.fahrenheit + " degrees Fahrenheit == "+ f4.getCelsius() +" degrees Celsius");
	System.out.println(f5.fahrenheit + " degrees Fahrenheit == "+ f5.getCelsius() +" degrees Celsius");
	}
}