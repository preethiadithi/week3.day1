package org.college;

public class Students extends Department{
	
	public void studentName( String name) {
     System.out.println("studentname:"+ name);
	}
	public void studentGrade(double grade) {
  System.out.println(" student grade:"+ grade);
	}
	public void studentId( int id) {
		System.out.println(" student id:"+ id);

	}
	public static void main (String[] args) {
		
		Students student = new Students();
		
		student.studentName("preethi");
		student.studentGrade(8.5);
		student.studentId(24);
		student.collegeRank(65);
		student.collegeCode(2116);
		student.deptName("ECE");
		student.collegeName("REC");
		
		
		}
     
		
  
	}

