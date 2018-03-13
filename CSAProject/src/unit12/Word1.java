package unit12;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word1 implements Comparable<Word1>
{
	private String word;

	public Word1( String s)
	{

		word = s;
	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;

		int count = 0;
		for (int i = 0; i <vowels.length(); i++) {
			for (int j = 0; j < word.length(); j++) {
				if(word.charAt(j)==vowels.charAt(i))
				{
					count++;
				}
			}
		}
		




		return count;
	}

	public int compareTo(Word1 rhs)
	{
		
		if(numVowels()>rhs.numVowels())
		{
			return 1;
		}
		else if(numVowels()<rhs.numVowels())
		{
			return -1;
		}
		else
		{
			if(word.compareTo(rhs.toString())>0)
			{
				return 1;
			}
			else if(word.compareTo(rhs.toString())<0)
			{
				return -1;
			}
			return 0;
		}

	
		
	}

	public String toString()
	{
		return word;
	}
}