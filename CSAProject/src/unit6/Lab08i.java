package unit6;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class Lab08i
{
	public static void main ( String[] args )
	{
		//add test cases
		Prime p = new Prime(24);
		System.out.println(p.toString() + " is prime: "+p.isPrime());
		Prime p2 = new Prime(7);
		System.out.println(p2.toString() + " is prime: "+p2.isPrime());
		Prime p3 = new Prime(100);
		System.out.println(p3.toString() + " is prime: "+p3.isPrime());
		Prime p4 = new Prime(113);
		System.out.println(p4.toString() + " is prime: "+p4.isPrime());
		Prime p5 = new Prime(65535);
		System.out.println(p5.toString() + " is prime: "+p5.isPrime());
		Prime p6 = new Prime(2);
		System.out.println(p6.toString() + " is prime: "+p6.isPrime());
		Prime p7 = new Prime(7334);
		System.out.println(p7.toString() + " is prime: "+p7.isPrime());
		Prime p8 = new Prime(7919);
		System.out.println(p8.toString() + " is prime: "+p8.isPrime());
		Prime p9 = new Prime(1115125003);
		System.out.println(p9.toString() + " is prime: "+p9.isPrime());
		
		
		
		
		
		
	}	
}