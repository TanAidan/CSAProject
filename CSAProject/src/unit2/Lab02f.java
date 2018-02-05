package unit2;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab02f
{
	public static void main( String[] args )
   {
		//add test cases
		Line s1 = new Line(1,9,14,2);
		Line s2 = new Line(1,7,18,3);
		Line s3 = new  Line(6,4,2,2);
		Line s4 = new Line(4,4,5,3);
		Line s5 = new Line(1,1,2,9);
		s1.calculateSlope();
		s2.calculateSlope();
		s3.calculateSlope();
		s4.calculateSlope();
		s5.calculateSlope();
		System.out.print("the slope is : ");
		s1.print();
		System.out.print("the slope is : ");
		s2.print();
		System.out.print("the slope is : ");
		s3.print();
		System.out.print("the slope is : ");
		s4.print();
		System.out.print("the slope is : ");
		s5.print();
		
		
		
	}
}