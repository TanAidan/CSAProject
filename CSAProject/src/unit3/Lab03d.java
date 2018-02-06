package unit3;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
		int x1,x2,y1,y2;
		//add test cases
		for (int i = 0; i <3; i++) {
			Scanner s= new Scanner(System.in);
		System.out.println("Enter X1 :: ");
		x1 = s.nextInt();
		System.out.println("Enter Y1 :: ");
		y1 = s.nextInt();
		System.out.println("Enter X2 :: ");
		x2 = s.nextInt();
		System.out.println("Enter Y2 :: ");
		y2 = s.nextInt();
		
		Distance d = new Distance(x1,y1,x2,y2);
		d.calcDistance();
		System.out.print("distance == ");
		d.print();
		
		}
		
			
	}
}