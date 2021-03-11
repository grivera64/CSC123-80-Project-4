//package project4;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class InstituteDemo
{
	
	public static void main(String[] args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random(5);
		
		Institute bits = new Institute("BITS");
		
		Department cs = new Department("CS"),
				ee = new Department("EE"),
				other = new Department("Other");
		
		bits.addDepartment(cs);
		bits.addDepartment(ee);
		bits.addDepartment(other);
		
		for (int i = 0; i < 6; i++)
		{
			
			System.out.printf("Please enter a student name: ");
			String studentName = keyboard.nextLine();
			
			System.out.printf("Please enter the department name EE or CS: ");
			String studentDepartment = keyboard.nextLine();
			
			int studentId = random.nextInt(100000) + 1;
			
			Student student = new Student();
			student.setName(studentName);
			student.setDept(studentDepartment.toUpperCase());
			student.setId(studentId);
			
			boolean notAdded = true;
			
			for (Department department : bits.getDepartmentList())
			{
				
				if (department.getDeptName().equalsIgnoreCase(studentDepartment))
				{
					
					department.addStudent(student);
					notAdded = false;
					break;
					
				}
				
			}
			
			if (notAdded)
			{
				
				other.addStudent(student);
				
			}
			
				
		}
		
		System.out.printf("Institute Name: %s\n", bits.getInstituteName());
		
		for (Department department : bits.getDepartmentList())
		{
			for (Student eachStudent : department.getStudentList())
			{
				
				System.out.printf("%s\n", eachStudent);
				
			}
		}
		
		System.out.printf("Total number of students: %d",
				bits.getTotalStudentsInInstitute());
	
		
	}
	
}