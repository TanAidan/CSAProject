package unit14;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class FancyWord
{
	private char[][] mat;

	public FancyWord()
	{
		mat = new char[0][0];
	}

   public FancyWord(String s)
	{
	   mat = new char[s.length()][s.length()];
	   int count =0;
		for(int i = 0; i<s.length();i++)
		{
			
			for (int j = 0; j < s.length(); j++) {
				if(j==count||j==s.length()-1-count||i==0||i==s.length()-1)
				{
					mat[i][j] = s.charAt(j);
				}
				else{
					mat[i][j]=' ';
					
				}
			}
			count++;
			
			
		}

	}

	public String toString()
	{
		String output="";
	
		for (char[] b: mat) {
			
			for (char b1:b) {
				output+=b1;
			}
			output+="\n";
			
		}



		return output+"\n\n";
	}
}