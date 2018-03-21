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

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Scanner s = new Scanner(new File("lab21i.dat"));
		while(s.hasNextLine())
		{
			int size = s.nextInt();
			s.nextLine();
		
			Maze m = new Maze(size,s.nextLine());
			System.out.println(m);
		}
		
	}
}