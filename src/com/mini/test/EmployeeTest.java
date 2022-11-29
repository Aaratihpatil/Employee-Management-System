package com.mini.test;
import java.util.Scanner;
//import java.util.regex.Pattern;

import com.mini.doa.EmployeeDaoImpl;
import com.mini.pojo.Employee;


public class EmployeeTest
{
	public static void main(String args[])
	{
		int exit=0;
		
		
		Scanner sc=new Scanner(System.in);
		Employee e;
		EmployeeDaoImpl empDimpl=new EmployeeDaoImpl();
		
		int flag;
		int option;
		String empName;
		String empAddress;
		String empEmail;
		String empMobileNo; 
		String empGender;
		String Department;
		String Position;
		float empSalary;
		
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("        ***Welcome To Employee Management System***          ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		do
		{
			System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("		***MAIN DISPLAY***		");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
			System.out.println("1. Add Employee Details");
			System.out.println("2. Search Employee Details");
			System.out.println("3. Update Employee Details");
			System.out.println("4. Delete Employee Details");
			System.out.println("5. Show All Employee Details");
			System.out.println("6. Exit");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
			
			option=sc.nextInt();
			sc.nextLine();
			
			switch(option)
			{
					
			
				case 1:
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");	
					System.out.println("		***Employee Add Details Section***                  ");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					
					
					/*   Optional Method
					boolean isValid = true;
					for(int i=0;i<empName.length();i++)
					{
						char ch=empName.charAt(i);
						if(ch>= 'a' && ch<='z' || ch>='A' && ch<='Z')
						{
							continue;
						}
						isValid = false;
					}
					if(isValid)
					{
						
					}
					else
					{
						System.out.println("invalid");
						System.out.println("Enter the Valid Name:");
						empName=sc.nextLine();
					}*/
					
					
					System.out.println("Enter The Name:");
					empName=sc.nextLine();
					
					while(!empName.matches("[a-z A-Z]+"))
					{
						System.out.println("Name Does Not Contains Number...Please Try Again!!!");
						System.out.println("Enter the Valid Name:");
						empName=sc.nextLine();	
					}
					
					System.out.println("Enter The Address:");
					empAddress=sc.nextLine();
					
					System.out.println("Enter The Email:");
					empEmail=sc.nextLine();
					while(!empEmail.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$"))
					{
					System.out.println("Invalid Email...Please Try Again!!!");
					System.out.println("Enter the Valid EmailAddress:");
					empEmail=sc.nextLine();	
					}
					
					
					
					System.out.println("Enter The MobileNo:");
					empMobileNo=sc.nextLine();
					
					while(!empMobileNo.matches("(0/91)?[7-9][0-9]{9}"))
					{
					System.out.println("MobileNumber Should Contains 10 Digits...Please Try Again!!!");
					System.out.println("Enter the Valid MobileNo:");
					empMobileNo=sc.nextLine();	
					}
					
										
					System.out.println("Enter The Gender:");
					empGender=sc.nextLine();
					
					while(!empGender.matches("Male||Female||Other"))
					{
					System.out.println("Gender Should Contains only Male||Female||Other...Please Try Again!!!");
					System.out.println("Enter the Valid Gender:");
					empGender=sc.nextLine();	
					}
					
					System.out.println("Enter The Department:");
					Department=sc.nextLine();
					while(!Department.matches("IT||HR||Accounting and finances||Sales and Marketing||UX/UI Department"))
					{
					System.out.println("Department Should Contains only IT||HR||Accounting and finances||Sales and Marketing||UX/UI Department...Please Try Again!!!");
					System.out.println("Enter the Valid Department:");
					Department=sc.nextLine();	
					}
					
					System.out.println("Enter The Position:");
					Position=sc.nextLine();
					while(!Position.matches("Developer||Product Manager||Security Engineer||Tester"))
					{
					System.out.println("Position Should Contains only Developer||Product Manager||Security Engineer||Tester...Please Try Again!!!");
					System.out.println("Enter the Valid Position:");
					Position=sc.nextLine();	
					}
					
					
					System.out.println("Enter The Salary:");
					empSalary=sc.nextFloat();
					
					
					
					
					e=new Employee();
					e.setEmpName(empName);
					e.setEmpAddress(empAddress);
					e.setEmpEmail(empEmail);
					e.setEmpMobileNo(empMobileNo);
					e.setEmpGender(empGender);
					e.setEmpDepartment(Department);
					e.setEmpPostion(Position);
					e.setEmpSalary(empSalary);
					
					
					flag=empDimpl.addEmployee(e);
					
					
					
					if(flag==1)
					{
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						System.out.println("Employee Added Successfully!!!");
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					}
					else
					{
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						System.out.println("Error while Adding New Employee... please Try Again!! ");
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					}
					
					break;
					
					
					
				case 2:
					
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");	
						System.out.println("		***Employee Show Details Section***                  ");
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						
						
						System.out.println("Enter The MobileNo:");
						empMobileNo=sc.nextLine();
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						
						e=empDimpl.SearchProfile(empMobileNo);
						
						if(e==null)
						{
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("Sorry No Such Details Found...Plaese Try Again");
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						}
						else
						{
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");	
							System.out.println("**Employee Details**");
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");	
							System.out.println(e);
						}
						
						break;
						
						
				case 3:
					
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");	
					System.out.println("		***Employee Update Details Section***                  ");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					
					System.out.println("Enter The MobileNo:");
					empMobileNo=sc.nextLine();
					
					e=empDimpl.SearchProfile(empMobileNo);
					
					if(e==null)
					{
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						System.out.println("Sorry No Such Details Found...Plaese Try Again");
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					}
					else
					{
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						System.out.println("Existing Employee Details");
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						System.out.println(e);
						
						
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						System.out.println("Are You Sure You Want To Update Your Profile");
						System.out.println("Enter Yes='y'|| No='n'");
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						char choice=sc.next().charAt(0);
						sc.nextLine();
						
						
						if(choice=='y')
						{
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("Enter The Choice You Want To Update Details");
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println( "0.Update All"+ "\n"+ "1.EmpName" + "\n" + "2.EmpAddress" + "\n" + "3.EmpEmail" + 
												"\n"+ "4.EmpMobileNo" + "\n" + "5.EmpGender" + "\n" + "6.Department" + 
												"\n" + "7.Position"+ "\n" +"8.Salary");
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
												
											
							int ch=sc.nextInt();
							sc.nextLine();
							switch(ch)
							{
								case 1:
									System.out.println("Enter The Name:");
									empName=sc.nextLine();
									e.setEmpName(empName);
									flag=empDimpl.updateEmployee(e);
									break;
								
								case 2:
									System.out.println("Enter The Address:");
									empAddress=sc.nextLine();
									e.setEmpAddress(empAddress);
									flag=empDimpl.updateEmployee(e);
									break;
								
								case 3:
									System.out.println("EnterThe Email:");
									empEmail=sc.nextLine();
									e.setEmpEmail(empEmail);
									flag=empDimpl.updateEmployee(e);
									break;
									
								case 4:
									System.out.println("Enter The MobileNo:");
									empMobileNo=sc.nextLine();
									e.setEmpMobileNo(empMobileNo);
									flag=empDimpl.updateEmployee(e);
									break;
									
								case 5:
									System.out.println("Enter The Gender:");
									empGender=sc.nextLine();
									e.setEmpGender(empGender);
									break;
									
								case 6:
									System.out.println("Enter The Department:");
									Department=sc.nextLine();
									e.setEmpDepartment(Department);
									break;
								
								case 7:
									System.out.println("Enter The Position:");
									Position=sc.nextLine();
									e.setEmpPostion(Position);
									break;
								
								case 8:
									System.out.println("Enter the Salary:");
									empSalary=sc.nextFloat();
									e.setEmpSalary(empSalary);
									break;
								
								default:
									System.out.println("Enter The Name:");
									empName=sc.nextLine();
									e.setEmpName(empName);
									System.out.println("Enter The Address:");
									empAddress=sc.nextLine();
									e.setEmpAddress(empAddress);
									System.out.println("Enter The Email:");
									empEmail=sc.nextLine();
									e.setEmpEmail(empEmail);
									System.out.println("Enter The MobileNo:");
									empMobileNo=sc.nextLine();
									e.setEmpMobileNo(empMobileNo);
									System.out.println("Enter The Gender:");
									empGender=sc.nextLine();
									e.setEmpGender(empGender);
									System.out.println("Enter The Department:");
									Department=sc.nextLine();
									e.setEmpDepartment(Department);
									System.out.println("Enter The Position:");
									Position=sc.nextLine();
									e.setEmpPostion(Position);
									System.out.println("Enter The Salary:");
									empSalary=sc.nextFloat();
									e.setEmpSalary(empSalary);
									flag=empDimpl.updateEmployee(e);
									
								}
							flag=empDimpl.updateEmployee(e);
							
							if(flag==1)
							{
								System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								System.out.println("Employee Updated Successfully!!!");
								System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							}
							else
							{
								System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								System.out.println("Error while Updating Details. Please Try Again!! ");
								System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							} 
						}
					
						
						else if(choice=='n')
								
							{
								System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								System.out.println("Thank You!! For Beging An Esteemed Member Of Our Website");
								System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							}
							
						break;
					}
					
				
				case 4:
					
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");	
					System.out.println("		***Employee Delete Details Section***                  ");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					
					System.out.println("Enter the MobileNo");
					empMobileNo=sc.nextLine();
					
					e=empDimpl.SearchProfile(empMobileNo);
					
					if(e==null)
					{
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						System.out.println("Sorry No Such Details Found... Please Try Again!!");
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					}
						else
						{
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("Existing Employee Details");
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println(e);
							
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							System.out.println("Are You Sure. You Want To Delete Your Details");
							System.out.println("Enter Yes='y'|| No='n'");
							System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
							
							char choice=sc.next().charAt(0);
							sc.nextLine();
							
								if(choice=='y')
								{
									flag=empDimpl.deleteEmployee(empMobileNo);
									
									if(flag==1)
									{
										
										System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("Employee Deleted Successfully!!!");
										System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										
									}
										else
										{
											System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
											System.out.println("Sorry!! Error While Deleting Employee Details.");
											System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										}
						
								}
						
									else if(choice=='n')
									{
										System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
										System.out.println("Thank You!! For Beging An Esteemed Member Of Our Website.");
										System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									}
										
								break;
								
						}
					
				case 5:
					
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");	
					System.out.println("		***Employee Show ALL Details Section***                  ");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					Employee[] elist=empDimpl.showAllEmployee();
					
					if(elist==null)
					{
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						System.out.println("Sorry Our Dataset Is Empty!! Employee Need To Be Added First");
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						
					}
					else
					{
						for(int i=0;i<elist.length;i++)
						{
							if(elist[i]!=null)
							{
								System.out.println(elist[i]);
							}
						}
					}
					break;
					
				case 6:
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");	
					System.out.println("		***Website EXIT Section***                  ");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("Do You Want To Exit From Website?");
					System.out.println("Enter Yes='y'|| No='n'");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					char choice=sc.next().charAt(0);
					sc.nextLine();
					
					
					
					if(choice=='y')
					{
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						System.out.println("Thank You!! Visit Us Again Soon!!");
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						exit=1;
					}
					else
					{
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						System.out.println("Thank You For Staying With Us!!");
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					}
					break;
					
					
						
				default:
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						System.out.println("Invalid Choice");
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						
					
					
			}
		}
		while(exit==0);
		
		
	}

}
