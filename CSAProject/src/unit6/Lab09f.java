package unit6;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab09f
{
	public static void main( String args[] )
	{
		//add test cases
		LetterRemover l1= new LetterRemover("I am Sam I am",'a');
		System.out.println(l1);
		System.out.println(l1.removeLetters());
		LetterRemover l2= new LetterRemover("ssssssssessssssssxxx",'s');
		System.out.println(l2);
		System.out.println(l2.removeLetters());
		LetterRemover l3= new LetterRemover("abababababababaab",'b');
		System.out.println(l3);
		System.out.println(l3.removeLetters());
		LetterRemover l4= new LetterRemover("abababbababababba",'x');
		System.out.println(l4);
		System.out.println(l4.removeLetters());
											
	}
}