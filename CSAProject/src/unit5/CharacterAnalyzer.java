package unit5;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;
	private int cValue;
	public CharacterAnalyzer()
	{
		theChar = ' ';
   
	}

	public CharacterAnalyzer(char c)
	{

setChar(c);
	}

	public void setChar(char c)
	{
		theChar = c;
		cValue = (int)c;
	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		if(cValue>= 65 && cValue <=90)
		{
			return true;
		}


		return false;
	}

	public boolean isLower( )
	{
 if(cValue >=97 && cValue <=122)
 {
	 return true;
 }


		return false;
	}
	
	public boolean isNumber( )
	{

if(cValue>=48&& cValue <=57)
{
	return true;
}

		return false;
	}	

	public int getASCII( )
	{
		return cValue;
	}

	public String toString()
	{
		if(isUpper())
	return ""+getChar() + " is an uppercase character. ASCII == " + getASCII() + "\n";	 
		if(isLower())
		return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";	 
		if(isNumber())
			return ""+getChar() + " is a number. ASCII == " + getASCII() + "\n";	 
		else
			return "please enter a number or a letter";

	}
}