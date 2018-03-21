package unit14;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class AtCounter
{
   private char[][] atMat;
   private int atCount;
   private boolean[][] cool;
	public AtCounter()
	{
		atCount=0;
		atMat = new char[][]{		{'@','-','@','-','-','@','-','@','@','@'},
									{'@','@','@','-','@','@','-','@','-','@'},
									{'-','-','-','-','-','-','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','-','@'},
									{'-','@','-','@','-','@','-','@','-','@'},
									{'@','@','@','@','@','@','-','@','@','@'},
									{'-','@','-','@','-','@','-','-','-','@'},
									{'-','@','@','@','-','@','-','-','-','-'},
									{'-','@','-','@','-','@','-','@','@','@'},
									{'-','@','@','@','@','@','-','@','@','@'}};
		cool = new boolean[10][10];
	}

	public int countAts(int r, int c)
	{

		
		//add in recursive code to count up the # of @s connected
		//start checking at spot [r,c]
		if(r>=0&&c>=0&&  r<atMat.length && c<atMat[atMat.length-1].length&&cool[r][c]!=true&&atMat[r][c]=='@')
		{
			cool[r][c]= true;
			atCount++;
			countAts(r, c+1);
			countAts(r, c-1);
			countAts(r+1, c);
			countAts(r-1, c);
			
			
		}
		
		
		return 0;
	}

	public int getAtCount()
	{
		return atCount;
	}

	public String toString()
	{
		String output="";
		output+=getAtCount()+" @s connected.";
		for (boolean[] b: cool) {
			for (boolean b1:b) {
				b1 = false;
			}
			
			
		}
		atCount = 0;
		return output;
		
	}
}