package ie.lyit.Testers;

import static org.junit.Assert.*;
import ie.lyit.Hotel.Employee;
import ie.lyit.Hotel.Date;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
	private Employee e1;

	@Before
	public void setUp() throws Exception 
	{
		e1 = new Employee("Ms", "Lisa", "Simpson", "123 High Road, LK", "0860987653", 20, 12, 1992, new Date(1,1,2009), 25000);
	}

	@Test
	public void testGetDateProbationEnds() 
	{
		assertEquals(e1.getDateProbationEnds(30), new Date(31,1,2009));
		assertEquals(e1.getDateProbationEnds(50), new Date(20,2,2009));
	}

}
