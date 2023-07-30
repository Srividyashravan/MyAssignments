package week2.day3.org.student;

import week2.day3.org.department.Department;

public class Student extends Department {
	
	
	
public void studentName()
{
	System.out.println("ABI");
}
public void studentDept()
{
	System.out.println("Mechanical Department");
}
public void studentId()
{
	System.out.println("14569");
}

public static void main(String[] args) {
	Student abc = new Student();
	abc.collegeCode();
	abc.collegeRank();
	abc.collgeName();
	abc.deptName();
	abc.studentDept();
	abc.studentId();
	abc.studentName();
	
	
}







}




