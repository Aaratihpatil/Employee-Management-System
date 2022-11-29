package com.mini.pojo;

public class Employee
{
	
	
	private int empId;
	private String empName;
	private String empAddress;
	private String empEmail;
	private String empMobileNo; 
	private String empGender;
	private String Department;
	private String Position;
	private float empSalary;
	
	
	static String Company="AHP";   //Common to all employess. There is no change in this field.
	
	
	
	//EMPID
	public int getEmpId()
	{
		return empId;
	}
	public void setEmpId(int empId)
	{
		this.empId=empId;
	}
	
	
	//EMPNAME
	public String getEmpName()
	{
		return empName;
	}
	public void setEmpName(String empName)
	{
		this.empName=empName;
	}
	
	//EMPAddress
	public String getEmpAddress()
	{
		return empAddress;
	}
	public void setEmpAddress(String empAddress)
	{
		this.empAddress=empAddress;
	}
	
	
	//EMPEMAIL
	public String getEmpEmail()
	{
		return empEmail;
	}
	public void setEmpEmail(String empEmail)
	{
		this.empEmail=empEmail;
	}
	
	//EMPMobileNo
	public String getEmpMobileNo()
	{
		return empMobileNo;
	}
	public void setEmpMobileNo(String empMobileNo)
	{
		this.empMobileNo=empMobileNo;
	}
	
	//EMPGENDER
	public String getEmpGender()
	{
		return empGender;
	}
	public void setEmpGender(String empGender)
	{
		this.empGender=empGender;
	}
	
	
	//EMPDEPARtMENT
	public String getEmpDepartment()
	{
		return Department;
	}
	public void setEmpDepartment(String Department)
	{
		this.Department=Department;
	}
	
	//EMPPOSITION
	public String getEmpPosition()
	{
		return Position;
	}
	public void setEmpPostion(String Position)
	{
		this.Position=Position;
	}
	
	//EMPSALARY
	public float getEmpSalary()
	{
		return empSalary;
	}
	
	public void setEmpSalary(float empSalary)
	{
		this.empSalary=empSalary;
	}
	
	
	
	
	@Override
	
	public String toString()
	{
		
	
	
		return 	"\nEmployee Id = "  +empId + " \nEmployee Name = " + empName + "\nEmployee Address = " + empAddress + "\nEmployee Email = " + empEmail +
				"\nEmployee MobileNo = "  + empMobileNo +  "\nEmployee Gender = " + empGender +  "\nEmployee Department = " +  Department +
				"\nEmployee Position = " + Position + "\nEmployee Salary = "  + empSalary + "\nCompany = " + Company ;
		
	}
	
	//No Parameterize Constructor
	public  Employee()
	{
		
	}
	
	//Parameterize Constructor
	public Employee(int empId , String empName , String empAddress, String empEmail,
					String empMobileNo , String empGender , String Department , String Position , float empSalary)
	
	{
	
		super();   //call No Parameterize Constructor
		
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empEmail = empEmail;
		this.empMobileNo = empMobileNo;
		this.empGender = empGender;
		this.Department = Department;
		this.Position = Position;
		this.empSalary = empSalary;
	
	
	}
	

}
