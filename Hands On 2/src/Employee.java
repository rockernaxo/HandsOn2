public class Employee {

	String name;
	double base_pay;
	int hours_worked;

	public Employee() {
		this.name = "-1";
		this.base_pay = 0;
		this.hours_worked = 0;
	}

	public Employee(String name, double base_pay, int hours_worked) {
		this.name = name;
		this.base_pay = base_pay;
		this.hours_worked = hours_worked;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBase_pay() {
		return base_pay;
	}

	public void setBase_pay(double base_pay) {
		this.base_pay = base_pay;
	}

	public int getHours_worked() {
		return hours_worked;
	}

	public void setHours_worked(int hours_worked) {
		this.hours_worked = hours_worked;
	}

	public double salary() {
		return this.hours_worked * this.base_pay;
	}
}
