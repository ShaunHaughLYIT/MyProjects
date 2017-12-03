package ie.lyit.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.*;
import java.util.*;

import ie.lyit.Hotel.Customer;

public class CustomerSerializer 
{
private ArrayList<Customer> customers;
	
	private final String FILENAME = "customers.ser";
	
	//default constructor
	public CustomerSerializer()
	{
		customers = new ArrayList<Customer>();
	}
	
	public void add()
	{
		//create a customer object
		Customer customer = new Customer();
		
		//read its details
		customer.read();
		
		//and add it to the customers array list
		customers.add(customer);
	}
	
	public Customer view(){
		Scanner keyboard = new Scanner(System.in);		

		// Read the number of the customer to be viewed from the user
		System.out.println("ENTER NUMBER OF CUSTOMERS : ");
		int customerToView=keyboard.nextInt();
		
		// for every Customer object in customers
	    for(Customer viewCustomer:customers){
		   // if it's number equals the number of the customerToView
		   if(viewCustomer.getNumber() == customerToView){
		      // display it
			  System.out.println(viewCustomer);
			  return viewCustomer;
		   }
		}
	    // if we reach this code the customer was not found so return null
	    return null;		
	}
	
	public void delete()
	{	
		// Call view() to find, display, & return the customers to delete
		Customer deleteCustomer = view();
		// If the customer != null, i.e. it was found then...
	    if(deleteCustomer != null)
		   // ...remove it from customers
	       customers.remove(deleteCustomer);
	}
	
	public void edit()
	{	
		// Call view() to find, display, & return the customer to edit
		Customer editCustomer = view();
		// If the customer != null, i.e. it was found then...
	    if(editCustomer != null){
		   // get it's index
		   int index=customers.indexOf(editCustomer);
		   // read in a new customer and...
		   editCustomer.read();
		   // reset the object in customers
		   customers.set(index, editCustomer);
	    }
	}

	
	//this method will serialize the customers array list when called
	public void writeRecordsToFile()
	{
		try {	
			FileOutputStream fileStream = new FileOutputStream(FILENAME);
			
			ObjectOutputStream os = new ObjectOutputStream(fileStream);
			
			os.writeObject(customers);
			
			os.close();
		}
		catch(FileNotFoundException fNFE) 
		{
			System.out.println("Cannot create file to store customers");
		}
		catch(IOException ioE)
		{
			System.out.println(ioE.getMessage());
		}
		
	}
	
	public void readRecordsFromFile()
	{
		try {	
			FileInputStream fileStream = new FileInputStream(FILENAME);
			
			ObjectInputStream is = new ObjectInputStream(fileStream);
			
			customers = (ArrayList<Customer>)is.readObject();
			
			is.close();
		}
		catch(FileNotFoundException fNFE) 
		{
			System.out.println("Cannot create file to store customers");
		}
		catch(IOException ioE)
		{
			System.out.println(ioE.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void list()
	{
		//for every customer in list
		for(Customer listCustomer:customers)
		{
			//display
			System.out.println(listCustomer);
		}
	}

}
