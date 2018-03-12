package unit11;

import java.util.ArrayList;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -


import java.util.Scanner;
import static java.lang.System.*;
import java.io.File;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		ArrayList<Class> c = new ArrayList<Class>();
		Scanner file = new Scanner(new File("gradebook.dat"));
		Class test = new Class(file.nextLine(), file.nextInt());
		c.add(test);
		file.nextLine();
		int i = 0;
		while(file.hasNextLine())
		{
		c.get(0).addStudent(i, new Student(file.nextLine(),file.nextLine()));	
		i++;
		}
		
		
		c.get(0).sort();
		out.println(c.get(0));	
		

		out.println("Failure List = " + c.get(0).getFailureList(70));	
		out.println("Highest Average = " + c.get(0).getStudentWithHighestAverage());
		out.println("Lowest Average = " + c.get(0).getStudentWithLowestAverage());
								
		out.println(String.format("Class Average = %.2f",c.get(0).getClassAverage()));									









	}		
}