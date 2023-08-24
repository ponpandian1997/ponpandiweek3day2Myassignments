   package org.student;

  import org.department.Department;

   public class Student extends Department {
	
	public void studentname() 
	{
		System.out.println("PONPANDI.P");
	}
	public void studentdepartment() 
	{
		System.out.println("MECHANICAL ENGG");
	}
	public void studentid()
	{
		System.out.println("id number is 415");
	}
	
	public static void main(String[] args) {
		
		Student stu =new  Student();
		stu.studentdepartment();
		stu.studentid();
		stu.studentname();
	    stu.department();
	    stu.collegecode();
	    stu.collegename();
	    stu.collegRank();
	    
		}
	
	  }
