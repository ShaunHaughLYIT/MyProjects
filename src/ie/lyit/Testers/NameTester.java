package ie.lyit.Testers;

import ie.lyit.Hotel.*;
import java.util.ArrayList;

public class NameTester 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Create a Name object called personA
		Name personA = new Name();
		
		//display details on screen
		System.out.println(personA);
		
		//set personA's name
		personA.setTitle("Mr");
		personA.setFirstName("Homer");
		personA.setSurname("Simpson");
		
		//display personA's details on screen
		System.out.println(personA);
		
		//Create a Name object called personB
		Name personB = new Name("Mrs", "Marge", "Simpson");
		
		//display details on screen
		System.out.println(personB);
		
		if(personA.equals(personB))
			System.out.println(personA + " is the same as " + personB);
		else
			System.out.println(personA + " is not the same as " + personB);
		
		if(personA.isFemale())
			System.out.println(personA + " is female.");
		else
			System.out.println(personA + " is not female.");
		
		ArrayList<Name> names = new ArrayList<Name>();
		names.add(new Name("Mr", "Bart", "Simpson"));
		names.add(personA);
		names.add(personB);
		names.trimToSize();
		
		for(Name tempName:names) 
			System.out.println(tempName);
		
		
		if(nameSearch(personA, names))
			System.out.println("FOUND!");
		else
			System.out.println("NOT FOUND!");
		

	}

	
	public static boolean nameSearch(Name searchName, ArrayList<Name> listOfNames)
	{
		for (Name currentName:listOfNames) 
		{
			if(currentName.equals(searchName))
				return true;
		}
		return false;
	}

}
