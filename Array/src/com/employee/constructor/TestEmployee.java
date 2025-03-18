package com.employee.constructor;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e[] = new Employee[2];
		
		e[0] = new Employee(1,"Harsha","Pune");
		e[1] = new Employee(2,"Shree","nanded city");
		
		for(int i=0; i<e.length; i++) {
			System.out.println("Employee id:" +e[i].eid);
			System.out.println("Employee Name:" +e[i].ename);
			System.out.println("Employee Address:" +e[i].eaddress);
		}

	}

}
