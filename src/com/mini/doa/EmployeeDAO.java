package com.mini.doa;
import com.mini.pojo.Employee;



public interface EmployeeDAO 
{
	
	public int addEmployee(Employee e);  //by id
	public Employee SearchProfile(String MobileNo); //byMobileNo
	public int updateEmployee(Employee e); //by phone number unique no
	public int deleteEmployee(String MobileNo); //by phone number unique no
	public Employee[] showAllEmployee(); 
		
}
