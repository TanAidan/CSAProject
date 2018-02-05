package unit2;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab02e
{
	public static void main( String[] args )
   {
		//add test cases
		//Fahrenheit f1 = new  Fahrenheit();
		Circle c1= new Circle();
		Circle c2= new Circle();
		Circle c3= new Circle();
		Circle c4= new Circle();
		Circle c5= new Circle();
		c1.setRadius(7.5);
		c2.setRadius(10);
		c3.setRadius(72.534);
		c4.setRadius(55);
		c5.setRadius(101);
		c1.calculateArea();
		c2.calculateArea();
		c3.calculateArea();
		c4.calculateArea();
		c5.calculateArea();
		System.out.print("The area is :: " );
		c1.print();
		System.out.print("The area is :: " );
		c2.print();
		System.out.print("The area is :: " );
		c3.print();
		System.out.print("The area is :: " );
		c4.print();
		System.out.print("The area is :: " );
		c5.print();
		
		
	}
}