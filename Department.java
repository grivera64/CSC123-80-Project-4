//package project4;

import java.util.ArrayList;

public class Department
{
	
	//Department fields
	private String deptName;
	private ArrayList<Student> studentList = new ArrayList<Student>();
	
	//default contructor
	public Department()
	{
		
		this.setDeptName("");
		
	}
	
	//constructor with deptName
	public Department(String deptName)
	{
		
		this.setDeptName(deptName);
		
	}
	
	/* setXXX() and getXXX() methods */
	public void setDeptName(String deptName)
	{
		
		this.deptName = deptName;
		
	}
	
	public String getDeptName()
	{
		
		return this.deptName;
		
	}
	
	//adds a student object to its list
	public void addStudent (Student student)
	{
		
		this.studentList.add(student);
		
	}
	
	//returns the departmnet's list of student objects
	public ArrayList<Student> getStudentList()
	{
		
		return this.studentList;
		
	}
	
}