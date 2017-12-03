package ie.lyit.Testers;

import ie.lyit.Hotel.*;

public class EmployeeTester {

	public static void main(String[] args) 
	{
		//create employee object
		Employee employeeA = new Employee();
		
		//display details on screen
		System.out.println(employeeA);
		
		//set details
		employeeA.setName(new Name("Mr", "Homer", "Simpson"));
		employeeA.setAddress("67 The Meadow, Cong, Co. Mayo");
		employeeA.setPhoneNumber(" 087 1234567");
		employeeA.setDOB(new Date(25, 2, 1952));
		employeeA.setStartDate(new Date(12, 2, 1999));
		employeeA.setSalary(60000);
		
		System.out.println(employeeA);

	}

}
