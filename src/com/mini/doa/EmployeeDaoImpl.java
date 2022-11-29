package com.mini.doa;

import com.mini.pojo.Employee;


public class EmployeeDaoImpl implements EmployeeDAO
{
	
		Employee[] elist = new Employee[10];    //arrayObject
		Employee e1;
		
		int index=0;
		
		@Override
		public int addEmployee(Employee e)
		{
			if(index<10)
			{
				e.setEmpId(index);
				elist[index]=e;
				index++;
				return 1;
			}
			else
			{
				return 0;
			}
			
		}
				

		@Override
		public Employee SearchProfile(String MobileNo)
		{
			for(int i=0;i<elist.length;i++)
			{
				e1=elist[i];
				if(e1!=null)
				{
					String empMobileNo=e1.getEmpMobileNo();
					if(empMobileNo.equals(MobileNo))
					{
						return e1;
					}
					
				}
			}
			return null;
		}
		
		@Override
		
		public int updateEmployee(Employee e)
		{
			if(e!=null)
			{
				int id=e.getEmpId();
				elist[id]=e;
				return 1;
			}
			return 0;
		}
		
		@Override
		public int deleteEmployee(String MobileNo)
		{
			for(int i=0;i<elist.length;i++)
			{
				e1=elist[i];
				
				if(e1!=null)
				{
					String empMobileNo=e1.getEmpMobileNo();
					
					if(empMobileNo.endsWith(MobileNo));
					elist[i]=null;
					return 1;
				}
			}
			return 0;
		}
		
		@Override
		public Employee[] showAllEmployee()
		{
			int haveMember=0;   //false
			
			for(int i=0;i<elist.length;i++)
			{
				if(elist[i]!=null)
				{
					haveMember=1; //true
					break;
				}
			}
			
			if(haveMember==1)
			{
				return elist;
			}
			else
			{
				return null;
			}
			
		}
}
