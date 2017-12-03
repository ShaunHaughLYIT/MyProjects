package ie.lyit.Hotel;

public class Name 
{
	private String title;
	private String firstName;
	private String surname;
	
	//default constructor
	public Name()
	{
		//title = null;
		//firstName = null;
		//surname = null;
		title = firstName = surname = null;
	}
	
	//initialization constructor
	public Name(String t, String fN, String sN)
	{
		title = t;
		firstName = fN;
		surname = sN;
	}
	
	public String toString()
	{
		return title + " " + firstName + " " + surname;
	}
	
	@Override
	//equals method
	public boolean equals(Object obj)
	{
		Name nObject;
		if (obj instanceof Name)
				nObject = (Name)obj;
		else
			return false;
		
		return this.title.equals(nObject.title)
				&& this.firstName.equals(nObject.firstName)
				&& this.surname.equals(nObject.surname);
	}
	
	//get methods
	public String getTitle()
	{
		return title;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getSurname()
	{
		return surname;
	}
	
	//set methods
	public void setTitle(String setTitleTo)
	{
		title = setTitleTo;
	}
	
	public void setFirstName(String setFirstNameTo)
	{
		firstName = setFirstNameTo;
	}
	
	public void setSurname(String setSurnameTo)
	{
		surname = setSurnameTo;
	}
	
	//Female method
	public boolean isFemale()
	{
		if(title.equalsIgnoreCase("Miss") ||
		   title.equalsIgnoreCase("Ms") ||
		   title.equalsIgnoreCase("Mrs"))
		   return true;
		else
			return false;
		
	}

}
