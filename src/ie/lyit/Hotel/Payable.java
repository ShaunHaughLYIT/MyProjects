package ie.lyit.Hotel;

public interface Payable 
{
	public abstract double calculateWage(double taxPercentage);
	
	//don't have to put in public abstract(default)
	double incrementSalary(double incrementAmount);
	
	//A Java interface can only contain abstract methods i.e methods without a body
}
