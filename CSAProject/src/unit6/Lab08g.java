package unit6;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab08g
{
	public static void main ( String[] args )
	{
		//add test cases
		LoopStats s = new LoopStats(1,5);
		System.out.println(s);
		System.out.println("total " + s.getTotal());
		System.out.println("even count "+ s.getEvenCount());
		System.out.println("odd count "+ s.getOddCount());
		System.out.println();
		LoopStats s1 = new LoopStats(2,8);
		System.out.println(s1);
		System.out.println("total " + s1.getTotal());
		System.out.println("even count "+ s1.getEvenCount());
		System.out.println("odd count "+ s1.getOddCount());
		System.out.println();
		LoopStats s2 = new LoopStats(5,15);
		System.out.println(s2);
		System.out.println("total " + s2.getTotal());
		System.out.println("even count "+ s2.getEvenCount());
		System.out.println("odd count "+ s2.getOddCount());
		
		
					
	}
}