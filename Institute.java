package project4;

import java.util.ArrayList;

public class Institute
{
	
	private String instituteName;
	private ArrayList<Department> departmentList = new ArrayList<Department>();
	
	public Institute()
	{
		
		this.setInstituteName("");
		
	}
	
	public Institute(String instituteName)
	{
		
		this.setInstituteName(instituteName);
		
	}
	
	public void setInstituteName(String instituteName)
	{
		
		this.instituteName = instituteName;
		
	}
	
	public String getInstituteName()
	{
		
		return this.instituteName;
		
	}
	
	public void addDepartment(Department department)
	{
		
		this.departmentList.add(department);
		
	}
	
	public ArrayList<Department> getDepartmentList()
	{
		
		return this.departmentList;
		
	}
	
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