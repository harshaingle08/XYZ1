package com.employee.getset;



public class Testemployee {

	public static void main(String[] args) {
		Employee emp[] = new Employee[2];

		Employee emp1 = new Employee();
		   emp1.setEid(10);
	       emp1.setEname("harsha");
	       emp1.setEaddress("Pune");

	    Employee emp2 = new Employee();
	       emp2.setEid(10);
	       emp2.setEname("varsha");
	       emp2.setEaddress("amt");
	      
	        emp[0] = emp1;
	        emp[1] = emp2;

	        for(int i =0; i<emp.length; i++) {
	        	System.out.println("Roll No: " + emp[i].getEid());
	        	System.out.println("Name: " + emp[i].getEname());
	        	System.out.println("Name: " + emp[i].getEaddress());


	        }

	}

}
