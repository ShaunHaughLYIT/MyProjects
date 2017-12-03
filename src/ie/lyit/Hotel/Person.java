package ie.lyit.Hotel;

public abstract class Person 
{
	protected Name name; //Person HAS-A name
	protected String address;
	protected String phoneNumber;
	
	//default constructor
	public Person()
	{
		name = new Name();
		address = null;
		phoneNumber = null;
	}
	
	//initialization constructor
	public Person(String t, String fN, String sn, String address, String phoneNumber)
	{
		name = new Name(t, fN, sn); //super class(Name)
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	public String toString()
	{
		return name + "," + address + "," + phoneNumber;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Person pObject;
		if (obj instanceof Person)
				pObject = (Person)obj;
		else
			return false;
		
		return (name.equals(pObject.name) && 
				address.equals(pObject.address) && 
				phoneNumber.equals(pObject.phoneNumber));
	}
	
	//get and set methods for name, address and phone number
	public void setName(Name nameIn)
	{
		name = nameIn;
	}
	
	public Name getName()
	{
		return name;
	}
	
	public void setAddress(String addressIn)
	{
		address = addressIn;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setPhoneNumber(String phoneNumberIn)
	{
		phoneNumber = phoneNumberIn;
	}
	
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	
	
	
}
