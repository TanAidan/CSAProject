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
import java.util.Random;

import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	String s = "";
	public MadLib()
	{



	}

	public MadLib(String fileName)
	{
		//load stuff
		
		loadNouns();
		loadVerbs();
		loadAdjectives();
		
		try{
			
			Scanner file = new Scanner(new File(fileName));
			while(file.hasNextLine()){
				s += file.nextLine();
				
			}
			
			
		
		
		
		
		
		
	
		
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		nouns = new ArrayList<String>();
		try{
			Scanner nouns1 = new Scanner(new File("nouns.dat"));
			while(nouns1.hasNext())
			{
				nouns.add(nouns1.nextLine());
			
			}
		
		
		nouns1.close();
		
		}
		catch(Exception e)
		{
		}	
		
	}
	
	public void loadVerbs()
	{
		verbs = new ArrayList<String>();
		try{
			Scanner verbs1 = new Scanner(new File("verbs.dat"));
			while(verbs1.hasNext())
			{
				verbs.add(verbs1.nextLine());
			
			}
	
	
			verbs1.close();

	
		}
		catch(Exception e)
		{
		}
	}

	public void loadAdjectives()
	{
		adjectives = new ArrayList<String>();
		try{
	
			Scanner adjectives1 = new Scanner(new File("adjectives.dat"));
			while(adjectives1.hasNext())
			{
				adjectives.add(adjectives1.nextLine());
			
			}
	
			adjectives1.close();
	
		}
		catch(Exception e)
		{
		}
	}

	public String getRandomVerb()
	{
		Random r = new Random();
		int ran = r.nextInt(verbs.size());
		
		return verbs.get(ran);
	}
	
	public String getRandomNoun()
	{
		Random r = new Random();
		int ran = r.nextInt(nouns.size());
		
		
		return nouns.get(ran);
	}
	
	public String getRandomAdjective()
	{
		Random r = new Random();
		int ran = r.nextInt(adjectives.size());
		
		return adjectives.get(ran);
	}		

	public String toString()
	{
	   for (int i = 0; i < s.length(); i++) {
		   if(Character.toString(s.charAt(i)).equals("#"))
		   {
			  
			   s= s.substring(0, i)+ getRandomNoun() +s.substring(i+1);
		   }
		   else if(Character.toString(s.charAt(i)).equals("@"))
		   {
			   s= s.substring(0, i)+ getRandomVerb() +s.substring(i+1);
		   }
		  
		   else if(Character.toString(s.charAt(i)).equals("&"))
		   {
			   s= s.substring(0, i)+ getRandomAdjective() +s.substring(i+1);
		   }
		  
		
	}
	return s;
	}
}