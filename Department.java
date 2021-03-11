package project4;

import java.util.ArrayList;

public class Department
{
	
	private String deptName;
	private ArrayList<Student> studentList = new ArrayList<Student>();
	
	public Department()
	{
		
		this.setDeptName("");
		
	}
	
	public Department(String deptName)
	{
		
		this.setDeptName(deptName);
		
	}
	
	public void setDeptName(String deptName)
	{
		
		this.deptName = deptName;
		
	}
	
	public String getDeptName()
	{
		
		return this.deptName;
		
	}
	
	public void addStudent (Student student)
	{
		
		this.studentList.add(student);
		
	}
	
	public ArrayList<Student> getStudentList()
	{
		
		return this.studentList;
		
	}
	
}