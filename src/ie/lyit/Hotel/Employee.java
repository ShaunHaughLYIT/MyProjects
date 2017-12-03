package ie.lyit.Hotel;

public class Employee extends Person implements Payable 
{
	private Date dob;
	private Date startDate;
	private double salary;
	private int number;
	
	private static int nextNumber = 1;
	
	private final double MAX_SALARY = 70000;
	private final double INCREMENT = 250;
	
	//Default constructor
	public Employee()
	{
		super();
		dob = new Date();
		startDate = new Date();
		salary = 0.0;
		
		number = nextNumber++;
	}
	
	//Initialization constructor
	public Employee(String t, String fN, String sn, String address, String phoneNo, int d, int m, int y, Date startDate, double salary)
	{
		super(t, fN, sn, address, phoneNo);
		dob = new Date(d, m, y);
		this.startDate = startDate;
		this.salary = salary;
		
		number = nextNumber++;
	}
	
	@Override
	public String toString()
	{
		return number + " " +super.toString() + " €" + salary;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Employee eObject;
		if(obj instanceof Employee)
			eObject = (Employee)obj;
		else
			return false;
		
		return(this.number == eObject.number);
	}
	
	//get and set methods
	public void setDOB(Date dob)
	{
		this.dob = dob;
	}
	
	public Date getDOB()
	{
		return dob;
	}
	
	public void setStartDate(Date startDate)
	{
		this.startDate = startDate;
	}
	
	public Date getStartDate()
	{
		return startDate;
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	@Override
	public double calculateWage(double taxPercentage) 
	{
		//calculate and return the wage as salary/12 less taxPercentage
		double wage = salary/12;
		wage -= (wage * (taxPercentage/100));
		
		return wage;
	}

	@Override
	public double incrementSalary(double incrementAmount) 
	{
		salary += incrementAmount;
		
		if(salary < MAX_SALARY)
			salary = MAX_SALARY;
		
		return salary;
	}
	
	//method to calculate Date probation ends
	public Date getDateProbationEnds(int noDaysProbation)
	{
		//dateProbationEnds = startDate
		Date dateProbationEnds = startDate;
		//add noDaysProbation onto dateProbationEnds
		dateProbationEnds.setDay(startDate.getDay() + noDaysProbation);
		
		//return dateProbationEnds
		return dateProbationEnds;
	}
	

}
