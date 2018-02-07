package unit3;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
   {
   	//add test cases
		int a,b,c;
		for (int i = 0; i <3; i++) {
			Scanner s= new Scanner(System.in);
		System.out.println("Enter a :: ");
		 a= s.nextInt();
		System.out.println("Enter b :: ");
		b = s.nextInt();
		System.out.println("Enter c :: ");
		c = s.nextInt();
		
		
		Quadratic q = new Quadratic(a,b,c);
		q.calcRoots();
		q.print();
		
		}
   	
		
		
	}
}