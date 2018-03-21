package unit14;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;
   private boolean[][] cool;
   private boolean b;
	public Maze()
	{


	}

	public Maze(int size, String line)
	{
		int count=0;
		maze  = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				maze[i][j] = Integer.parseInt(line.substring(count,count+1));
				count+=2;
			}
		}
		cool = new boolean[size][size];
	}

	public boolean hasExitPath(int r, int c)
	{
		
		if(r>=0&&c>=0&&  r<maze.length && c<maze[maze.length-1].length&&cool[r][c]!=true&& maze[r][c]==1)
		{
			if(c== maze.length-1)
			{ 
				b = true;
				return true;
				
			}
			else{
			cool[r][c]= true;
			
			hasExitPath(r, c+1);
			hasExitPath(r, c-1);
			hasExitPath(r+1, c);
			hasExitPath(r-1, c);
			}
			
		}

		return false;
	}

	public String toString()
	{
		String output="";
		for (int[] b: maze) {
			
			for (int b1:b) {
				output+=b1+" ";
			}
			output+="\n";
			
		}
		for (boolean[] b: cool) {
			for (boolean b1:b) {
				b1=false;
			}
			
			
		}
		output+="\n";
		hasExitPath(0,0);
		if(b)
			output+="exit found";
		else 
			output+="exit not found";
		
		//return output;
		return output;

	}
}