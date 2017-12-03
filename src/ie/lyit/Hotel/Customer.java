package ie.lyit.Hotel;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.*;
import java.io.*;
import javax.swing.*;

public class Customer extends Person 
{
	private String emailAddress;
	private int number;
	
	private static int nextNumber = 1;
	
	public Customer()
	{
		super();
		emailAddress = null;
		number = nextNumber++;
	}
	
	public Customer(String t, String fN, String sn, String address, String pNo, String email)
	{
		super(t, fN, sn, address, pNo);
		emailAddress = email;
		number = nextNumber++;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + "," + emailAddress;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Customer cObject;
		if(obj instanceof Customer)
			cObject = (Customer)obj;
		else
			return false;
		
		return(number == cObject.number);
				
	}
	
	public void setEmailAddress(String emailAddress)
	{
		this.emailAddress = emailAddress;
	}
	
	public String getEmailAddress()
	{
		return this.emailAddress;
	}
	
	//should'nt be able to set number as it is unique
	public int getNumber()
	{
		return number;
	}

	public void read() 
	{
		JTextField txtName = new JTextField();
	      txtName.setText("" + this.getName());
	      txtName.requestFocus();
	      JTextField txtEmailAddress = new JTextField();
	      JTextField txtAddress = new JTextField();
	      JTextField txtNumber = new JTextField();

	      Object[] message = 
	    	  {
	          "Name of Customer:", txtName,
	          "Email Address:", txtEmailAddress,
	          "Address:", txtAddress,
	          "Number:", txtNumber,
	      };

	      int option = JOptionPane.showConfirmDialog(null, message, "Enter book details", JOptionPane.OK_CANCEL_OPTION);

	      if (option == JOptionPane.OK_OPTION)
	      {
	          this.emailAddress = txtEmailAddress.getText();
	          this.address = txtAddress.getText();
	      } 
		
	}
}
