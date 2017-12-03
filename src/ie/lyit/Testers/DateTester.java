package ie.lyit.Testers;

import ie.lyit.Hotel.Date;
import java.util.Scanner;

public class DateTester 
{
	public static void main(String[] args) 
	{
		Date d1 = new Date();
        System.out.println(d1);      

	    d1.setDay(4);
		d1.setMonth(6);
		d1.setYear(1941);
		
		System.out.println(d1);
      
		Date d2 = new Date(28, 12, 1982);
        System.out.println(d2);
      
		if(d1.equals(d2))
			System.out.println("Date's are equal.");
		else
			System.out.println("Date's are not equal.");
		
		Date myDate1 = new Date();
		int setDayTo = 32, setMonthTo = 13, setYearTo = -2009;
		boolean goodInput = false;
		Scanner keyboard = new Scanner(System.in);
		
		do {
		
		try 
		{
			
			//set myDate1 to invalid values - should throw exception
			myDate1.setDay(setDayTo);
			myDate1.setMonth(setMonthTo);
			myDate1.setYear(setYearTo);
			goodInput = true;
		}
		catch(IllegalArgumentException iEA)
		{
			System.out.println("Incorrect day, month or year.");
			
			System.out.println("RE-ENTER VALID VALUE FOR DAY: ");
			setDayTo = keyboard.nextInt();
			System.out.println("RE-ENTER VALID VALUE FOR MONTH: ");
			setMonthTo = keyboard.nextInt();
			System.out.println("RE-ENTER VALID VALUE FOR YEAR: ");
			setYearTo = keyboard.nextInt();
			
			
		}
		
		}while(!goodInput);
		
		try {
		Date myDate2 = new Date(33, 15, 2017);
		}
		catch(IllegalArgumentException iEA)
		{
			System.out.println("INCORRECT DATE");
		}
		
	}
	
	
}