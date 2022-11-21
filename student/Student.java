package org.student ;

import org.college.College;

public class Student extends College {
	public void studentName()
	{
	System.out.println("Sankeetha");

	}
	public void studentDept()
	{
	System.out.println("Computer Science ");

	}
	
	public void studentId()
	{
	System.out.println("A0690982");

	}
	
	//Assignment 4
	
	public void getStudentInfo(int a,int b)
	{
	System.out.println("id: "+" " +a + "  reg: " +"   "+b );
	}
	public void getStudentInfo(int a,String b)
	{
	System.out.println("Roll: "+"   " +a + "  Name: " +"   "+b );
	}
	public void getStudentInfo(String a,long b)
	{
	System.out.println("Depart: "+"   " +a + "  Phone: " +"   "+b );
	}
	
	public static void main(String[] args) {
		
		Student std = new Student();
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		std.deptName();
		std.studentName();
		std.studentDept();
		std.studentId();
		std.getStudentInfo(145,124);
		std.getStudentInfo(74,"Sank");
		std.getStudentInfo("CSC",898987546);
	}
}
