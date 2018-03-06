package unit10;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{

		count = new ArrayList<Integer>();
		letters= new ArrayList<Character>();


	}

	public Histogram(char[] values, String fName)
	{
		count = new ArrayList<Integer>();
		letters= new ArrayList<Character>();
		for (int i = 0; i < values.length; i++) {
			letters.add(values[i]);
		}
		fileName = fName;



		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{

		
		
			for (int i = 0; i < letters.size(); i++) {
				Scanner file = new Scanner(new File(fileName));
				int j=0;
				
				while(file.hasNext()){
					System.out.println(file.next());
				/*if(file.next().equals(Character.toString(letters.get(i))));
					j++;
				}*/
				//count.add(j);
				}
				}
		//	}
		}
			






	

	public char mostFrequent()
	{
		int greatest =count.get(0);
		int index = 0;
		for (int i = 1; i < count.size(); i++) {
			if(greatest>count.get(i))
			{
				greatest = count.get(i);
				index = i;
			}
		}
		return letters.get(index);
	}

	public char leastFrequent()
	{

		int least =count.get(0);
		int index = 0;
		for (int i = 1; i < count.size(); i++) {
			if(least<count.get(i))
			{
				least = count.get(i);
				index = i;
			}
		}
		return letters.get(index);

		
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}