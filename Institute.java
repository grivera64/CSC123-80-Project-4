//package project4;

import java.util.ArrayList;

public class Institute
{
	
	//institute fields
	private String instituteName;
	private ArrayList<Department> departmentList = new ArrayList<Department>();
	
	//default constructor
	public Institute()
	{
		
		this.setInstituteName("");
		
	}
	
	//constructor with instituteName
	public Institute(String instituteName)
	{
		
		this.setInstituteName(instituteName);
		
	}
	
	/* setXXX() and getXXX() methods */
	public void setInstituteName(String instituteName)
	{
		
		this.instituteName = instituteName;
		
	}
	
	public String getInstituteName()
	{
		
		return this.instituteName;
		
	}
	
	//adds a department to its list of departments
	public void addDepartment(Department department)
	{
		
		this.departmentList.add(department);
		
	}
	
	//returns the departments in the instistute
	public ArrayList<Department> getDepartmentList()
	{
		
		return this.departmentList;
		
	}
	
	//returns the number of students in the institute (all of the departments)
	public int getTotalStudentsInInstitute()
	{
		
		int noOfStudents = 0;
		
		for (Department department : this.getDepartmentList())
		{
			for (Student student : department.getStudentList())
			{
				
				noOfStudents++;
				
			}
		}
		
		return noOfStudents;
		
	}
	
	
	
}