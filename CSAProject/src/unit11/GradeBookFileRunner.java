package unit11;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner file = new Scanner(new File("gradebook.dat"));
		Class test = new Class(file.nextLine(), file.nextInt());
		file.nextLine();
		int i = 0;
		while(file.hasNextLine())
		{
		test.addStudent(i, new Student(file.nextLine(),file.nextLine()));	
		i++;
		}
		
		
		test.sort();
		out.println(test);	
		

		out.println("Failure List = " + test.getFailureList(70));	
		out.println("Highest Average = " + test.getStudentWithHighestAverage());
		out.println("Lowest Average = " + test.getStudentWithLowestAverage());
								
		out.println(String.format("Class Average = %.2f",test.getClassAverage()));									









	}		
}