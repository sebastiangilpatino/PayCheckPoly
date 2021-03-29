package LAB51;

public class Salaried extends Employee {

	private double salary;

	public Salaried(int empID, double salary) {
		super(empID);
		this.salary = salary;
	}

	@Override
	public double calcGrossPay(DateRange date) {
		return salary;
	}

}
