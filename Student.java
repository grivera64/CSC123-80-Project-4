package project4;

public class Student
{
	
	//student fields
	private String dept, name;
	private int id;
	
	//default constructor initializing everything as empty or blank
	public Student()
	{
		
		this.setDept("");
		this.setName("");
		this.setId(0);
		
	}
	
	/* setXXX() methods that reset the student fields */
	public void setDept(String dept)
	{
		
		this.dept = dept;
		
	}
	
	public void setName(String name)
	{
		
		this.name = name;
		
	}
	
	public void setId(int id)
	{
		
		this.id = id;
		
	}
	
	/* getXXX() methods that return the fields values individually */
	public String getDept()
	{
		
		return this.dept;
		
	}
	
	public String getName()
	{
		
		return this.name;
		
	}
	
	public int getId()
	{
		
		return this.id;
		
	}
	
	//@Override
	//returns the student's info as a single-line string
	public String toString()
	{
		
		return String.format("%s %d %s", this.name, this.id, this.dept);
		
	}
	
}