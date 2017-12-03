package ie.lyit.Testers;

import ie.lyit.Hotel.*;

public class CustomerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customerA = new Customer();
		System.out.println(customerA);
		
		customerA.setName(new Name("Mr", "Homer", "Simpson"));
		customerA.setPhoneNumber("087674634");
		customerA.setEmailAddress("homersimpson@gmail.com");
		customerA.setAddress("43 Main Street, Letterkenny");
		
		
		
		

	}

}
