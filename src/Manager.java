
public class Manager extends Employee{
	
	String officeNumber;
	
	public Manager (String name, double base_pay, int hours_work, String officeNumber) {
		super(name, base_pay, hours_work);
		this.officeNumber=officeNumber;
	}
}
