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

public class Grades
{
	private double[] grades;
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);		
	}
	
	public void setGrades(String gradeList)
	{
		Scanner s = new Scanner(gradeList);
		grades= new double[s.nextInt()];
		s.next();
		int i = 0;
		while(s.hasNextDouble())
		{
			grades[i] = s.nextDouble();
			i++;
		}


	}
	
	public void setGrade(int spot, double grade)
	{
	
		grades[spot]= grade;


	}
	
	public double getSum()
	{
		double sum=0.0;
		for (int i = 0; i < grades.length; i++) {
			sum+=grades[i];
		}



		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		for (int i = 0; i < grades.length; i++) {
			if(low>grades[i])
			{
				low= grades[i];
			}
		}
		



		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		for (int i = 0; i < grades.length; i++) {
			if(high<grades[i])
			{
				high= grades[i];
			}
		}
		




		return high;
	}
	
	public int getNumGrades()
	{
		return grades.length;
	}
	
	public String toString()
	{
		String output = "";
		for (int i = 0; i < grades.length; i++) {
			output+=grades[i]+" ";
			
		}





		return output;
	}	
}