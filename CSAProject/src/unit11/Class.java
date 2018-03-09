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

public class Class
{
	private String name;
	private Student[] studentList;
	
	public Class()
	{
		name="";
		studentList=new Student[0];
	}
	
	public Class(String name, int stuCount)
	{
		this.name = name;
		studentList = new Student[stuCount];
	
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList[stuNum]= s;

	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		
		for (int i = 0; i < studentList.length; i++) {
			classAverage += getStudentAverage(i);
		}
		classAverage/= studentList.length;

		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList[stuNum].getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		int index = 0;
		for (int i = 0; i < studentList.length; i++) {
			if(studentList[i].getName().equals(stuName))
			{
				index = i;
			}
		}
		

		return getStudentAverage(index);
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList[stuNum].getName();
	}

	public String getStudentWithHighestAverage()
	{
		int index = 0;		

		for (int i = 0; i < studentList.length; i++) {
			if(studentList[index].compareTo(studentList[i])==-1)
			{
				index = i;
			}
		}




		return getStudentName(index);
	}

	public String getStudentWithLowestAverage()
	{
		int index = 0;		

		for (int i = 0; i < studentList.length; i++) {
			if(studentList[index].compareTo(studentList[i])==1)
			{
				index = i;
			}
		}




		return getStudentName(index);
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";

		for (int i = 0; i < studentList.length; i++) {
			if(getStudentAverage(i)<failingGrade)
			{
				output+=" "+getStudentName(i);
			}
		}



		return output;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";

		for (int i = 0; i < studentList.length; i++) {
			output+= studentList[i] +"\t"+ getStudentAverage(i)+"\n";
		}


		return output;
	}  	
	public void sort()
	{
		for (int i = 0; i < studentList.length-1; i++) {
			for (int j = 0; j < studentList.length-1; j++) {
				if(studentList[j].compareTo(studentList[j+1])==1)
				{
					Student temp = studentList[j];
					studentList[j]=studentList[j+1];
					studentList[j+1] = temp;
					
				}
			}
		}
	}
}